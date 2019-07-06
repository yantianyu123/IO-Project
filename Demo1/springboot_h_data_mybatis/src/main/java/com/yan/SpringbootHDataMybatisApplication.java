package com.yan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan(value = "com.yan.mapper")
@SpringBootApplication
@EnableCaching //开启缓存注解
public class SpringbootHDataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHDataMybatisApplication.class, args);
    }

}
