package com.ahoo.controller;

import com.ahoo.dto.MessageDto;
import com.ahoo.entity.UserEntity;
import com.ahoo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by eoooxy on 2017/2/19.
 */

@Controller
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping("/back/isLogin.do")
    public String isLogin(UserEntity userEntity, HttpServletRequest request) {

        if (userService.isUser(userEntity) > 0) {
            HttpSession session = request.getSession();
            session.setAttribute("username", userEntity.getUsername());
            session.setAttribute("passwd", userEntity.getPasswd());
            return "back/index";
        }
        return "back/login";
    }

    @RequestMapping("/back/updateUser.json")
    public void update(String passwd, HttpServletRequest request, ModelMap modelMap) {

        MessageDto msg = new MessageDto();
        if (passwd != null && "".equals(passwd)) {
            HttpSession session = request.getSession();
            String username = (String) session.getAttribute("username");
            UserEntity entity = new UserEntity();
            entity.setPasswd(passwd);
            entity.setUsername(username);
            if (userService.update(entity) > 0) {
                session.setAttribute("username", entity.getUsername());
                session.setAttribute("passwd", entity.getPasswd());
                msg.setCode("1");
                msg.setCtx("更改成功，新密码为" + entity.getPasswd());
            } else {
                msg.setCode("0");
                msg.setCtx("更改失败,请联系管理员");
            }

        }
    }


}