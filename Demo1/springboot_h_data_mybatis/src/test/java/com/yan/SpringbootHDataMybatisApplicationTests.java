package com.yan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootHDataMybatisApplicationTests {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void test2(){
        stringRedisTemplate.opsForValue().set("MyKey1","呵呵");
        System.out.println(stringRedisTemplate.opsForValue().get("k1"));
    }
    @Test
    public void contextLoads() {
    }
    @Test
    public void test1(){
        int i1 = 128;
        int i2 = 128;
        System.out.println(i1 == i2);
        System.out.println(0.1*3);
    }

}
