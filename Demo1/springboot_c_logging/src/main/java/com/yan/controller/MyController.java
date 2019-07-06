package com.yan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 闫天宇
 * @date 2019/6/22-10:42
 */
@RestController
public class MyController {
    @RequestMapping("/1")
    public String test1(){
        return "111111111111";
    }
}
