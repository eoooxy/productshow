package com.ahoo.controller;

import com.ahoo.entity.UserEntity;
import com.ahoo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by eoooxy on 2017/2/19.
 */

@Controller
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping("/back/isLogin.do")
    public String isLogin(UserEntity userEntity) {

        if (userService.isUser(userEntity) > 0) {
            return "back/index";
        }
        return "back/login";
    }


}
