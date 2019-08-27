package com.baizhi.controller;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/test")
public class UserController {

    @Autowired
    DruidDataSource druidDataSource;

    @RequestMapping("/test")
    @ResponseBody
    public void test(){
        System.out.println(druidDataSource);
        System.out.println(druidDataSource);
    }

}
