package cn.it.yan.controller;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 闫天宇
 * @date 2019/6/21-9:49
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    public @ResponseBody String hello(){
        System.out.println("方法正在执行！！");
        return "hello world";
    }
}
