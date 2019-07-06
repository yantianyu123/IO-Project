package com.yan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;

/**
 * @author 闫天宇
 * @date 2019/6/23-16:55
 */
@Controller
public class MyController {
    @PostMapping("/dates")
    public String dates(Date birth){
        System.out.println(birth);
        return "redirect:/index";
    }

}
