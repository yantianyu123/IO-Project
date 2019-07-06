package com.yan.controller;

import com.yan.entity.User;
import com.yan.mapper.UserMapper;
import com.yan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 闫天宇
 * @date 2019/7/3-10:15
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    //根据id查询
    @RequestMapping("/query/{id}")
    public User queryUserById(@PathVariable("id") int id){
        return userService.getUserById(id);
    }


}
