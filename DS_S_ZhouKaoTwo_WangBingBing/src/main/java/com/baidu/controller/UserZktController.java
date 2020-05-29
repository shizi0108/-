package com.baidu.controller;


import com.baidu.common.resp.ResponseResult;
import com.baidu.entity.UserZkt;
import com.baidu.service.IUserZktService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author WangBingBing
 * @since 2020-05-27
 */
@RestController
@RequestMapping("/user")
public class UserZktController {

    @Autowired
    private IUserZktService iUserZktService;

    @PostMapping("/login")
    public ResponseResult login(@RequestBody UserZkt user){
        ResponseResult result = ResponseResult.SUCCESS();
        try {
            QueryWrapper wrapper=new QueryWrapper();
            wrapper.eq("UNAME",user.getUname());
            wrapper.eq("PWD",user.getPwd());
            UserZkt one = iUserZktService.getOne(wrapper);
            if(one!=null){
                result.setMessage("登陆成功");
                result.setResult(one);
            }else{
                result.setSuccess(false);
                result.setMessage("登陆失败");
            }
        } catch (Exception e) {
                result.setSuccess(false);
                result.setMessage("bug"+e.toString());
        }
        return result;
    }
}
