package com.iweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/img")
public class HelloController {

    //http://localhost:8080/img/hello
    //只要有请求/hello，就由这个方法来处理，
    @RequestMapping({"/hello","/hello1"})
    public String hello(){
        System.out.println("正在访问hello方法");
        //跳转到success.html页面去
        return "/success.html";
    }
}
