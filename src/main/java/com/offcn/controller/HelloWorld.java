package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 吴方恩
 * @create 2018/12/1-14:05
 */

@Controller
public class HelloWorld {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("dashabi");
        return "hello world";
    }
}
