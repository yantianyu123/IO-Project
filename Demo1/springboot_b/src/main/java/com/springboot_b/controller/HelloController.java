package com.springboot_b.controller;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 闫天宇
 * @date 2019/6/21-12:02
 */
@RestController
public class HelloController {
    @RequestMapping("/hello1")
    public String hello1(){
        return "hello world1";
    }
}
