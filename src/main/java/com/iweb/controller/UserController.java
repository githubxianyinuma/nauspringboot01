package com.iweb.controller;

import com.iweb.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    /**
     * new User对象，并且把请求中的用户名+密码注入这个对象中
     * @param user
     * @return
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(User user ){
        System.out.println(user);
        return "注册成功";
    }
}
