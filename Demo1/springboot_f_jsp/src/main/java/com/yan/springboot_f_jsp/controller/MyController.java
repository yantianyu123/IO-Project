package com.yan.springboot_f_jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 闫天宇
 * @date 2019/7/1-20:41
 */
@Controller
public class MyController {
    @RequestMapping("/success")
    public String index(){
        return "WEB-INF/success";
    }
}
