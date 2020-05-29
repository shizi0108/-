package com.baidu.controller;


import com.baidu.common.resp.ResponseResult;
import com.baidu.entity.ShopZkt;
import com.baidu.service.IShopZktService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author WangBingBing
 * @since 2020-05-27
 */
@RestController
@RequestMapping("/shop")
public class ShopZktController {

    @Autowired
    private IShopZktService iShopZktService;

    @GetMapping("/list")
    public ResponseResult list() {
        ResponseResult result = ResponseResult.SUCCESS();

        try {
            List<ShopZkt> list = iShopZktService.list();
            result.setResult(list);
            result.setMessage("成功");
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage("失败");
        }
        return result;
    }

    @GetMapping("/getOneById/{id}")
    public ResponseResult getOneById(@PathVariable long id) {
        ResponseResult result = ResponseResult.SUCCESS();

        try {
            ShopZkt byId = iShopZktService.getById(id);
            result.setResult(byId);
            result.setMessage("成功");
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage("bug" + e.toString());
        }
        return result;
    }
}
