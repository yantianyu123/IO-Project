package com.yan.service;

import com.yan.entity.User;
import com.yan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 闫天宇
 * @date 2019/7/3-18:47
 */
//@CacheConfig:统一配置缓存名字，使用的缓存管理器
@CacheConfig(cacheNames = "userCache",cacheManager = "userRedisCacheManager")
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Resource(name = "userRedisCacheManager")
    RedisCacheManager userRedisCacheManager;

    //key:当key在缓存中存在时就不查询数据库了
    //cacheNames:缓存的名字
    @Cacheable(key = "#id")
    public User getUserById(int id){
        System.out.println("查询员工了......");
        return userMapper.getUserById(id);
    }
}
