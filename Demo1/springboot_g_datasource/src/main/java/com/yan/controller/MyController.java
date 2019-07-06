package com.yan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author 闫天宇
 * @date 2019/7/2-18:01
 */
@Controller
public class MyController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/index")
    public @ResponseBody List<Map<String, Object>> index(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from users");
        return maps;
    }
}
