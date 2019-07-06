package com.springboot_b.config;

import com.springboot_b.entity.Dao;
import com.springboot_b.entity.Persion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author 闫天宇
 * @date 2019/6/21-18:09
 */
@Configuration
public class MyAppConfig {
    @Bean
    public Dao dao(){
        return  new Dao();
    }
}
