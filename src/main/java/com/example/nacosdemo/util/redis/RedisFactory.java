package com.example.nacosdemo.util.redis;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @description: rediskey的设置类
 * @author: LuckyBoy
 * @create: 2020-06-02 13:54
 **/
@Component
public class RedisFactory {
    @Resource
    private RedisUtil redisUtil;



    public boolean set(String key, String value, long ex) {
        return redisUtil.set(key, value, ex);
    }

    public Object get(String key) {
        return redisUtil.get(key);
    }

}
