package com.lyw.cloud.lyw.oauth2.api.controller;

import com.lyw.cloud.lyw.oauth2.api.domain.UserDTO;
import com.lyw.cloud.lyw.oauth2.api.holder.LoginUserHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: luohx
 * @Description: 获取登录用户信息接口
 * @Date: 2020/7/30 11:24
 * @Version: 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController{

    @Autowired
    private LoginUserHolder loginUserHolder;

    @GetMapping("/currentUser")
    public UserDTO currentUser() {
        return loginUserHolder.getCurrentUser();
    }




}
