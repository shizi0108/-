package com.baidu.controller;


import com.baidu.common.resp.OderRes;
import com.baidu.common.resp.ResponseResult;
import com.baidu.common.resp.ShopRes;
import com.baidu.entity.OderZkt;
import com.baidu.entity.ShopZkt;
import com.baidu.service.IOderZktService;
import com.baidu.service.IShopZktService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author WangBingBing
 * @since 2020-05-27
 */
@RestController
@RequestMapping("/oder")
public class OderZktController {
    @Autowired
    private IOderZktService iOderZktService;

    @Autowired
    private IShopZktService iShopZktService;

    /**
     * 列表
     * @param oderZkt
     * @return
     */
    @PostMapping("/list")
    public ResponseResult list(@RequestBody OderZkt oderZkt) {
        ResponseResult result = ResponseResult.SUCCESS();

        try {
            Map map = new HashMap();
            List<OderRes> list = iOderZktService.getAllOder(map);
            result.setResult(list);
            result.setMessage("查询成功");
        } catch (Exception e) {
            result.setMessage("bug" + e.toString());
            result.setSuccess(false);
        }
        return result;
    }

    /**
     * 订单添加
     * @param shop
     * @return
     */
    @PostMapping("/savaOder")
    public ResponseResult savaOder(@RequestBody ShopRes shop) {
        ResponseResult result = ResponseResult.SUCCESS();
        try {
            OderZkt zkt = new OderZkt();
            Random random = new Random();
            int dbh = random.nextInt(999999);
            if (dbh < 100000) {
                dbh += 100000;
            }
            zkt.setDbh(dbh);
            zkt.setShopid(shop.getSid());
            zkt.setSid(shop.getSid());
            zkt.setBnum(shop.getBnum());
            zkt.setUid(shop.getUid());
            zkt.setBtime(new Date());
            zkt.setStatus(0);
            iOderZktService.save(zkt);
            result.setMessage("订单添加成功");
        } catch (Exception e) {
            result.setMessage("bug" + e.toString());
            result.setSuccess(false);
        }
        return result;
    }

    /**
     * 审核
     * @param res
     * @return
     */
    @PostMapping("/sub")
    public ResponseResult sub(@RequestBody OderRes res){
        ResponseResult result=ResponseResult.SUCCESS();
        try {
            Long did = res.getDid();
            OderZkt byId = iOderZktService.getById(did);
            byId.setStatus(1);
            iOderZktService.saveOrUpdate(byId);
            long sid = res.getSid();
            Integer bnum = res.getBnum();
            ShopZkt shopZkt = iShopZktService.getById(sid);
            shopZkt.setStorage(shopZkt.getStorage()+bnum);
            iShopZktService.saveOrUpdate(shopZkt);
            result.setMessage("审核成功");
        }catch (Exception e){
            result.setMessage("bug"+e.toString());
            result.setSuccess(false);
        }
        return result;
    }
}
