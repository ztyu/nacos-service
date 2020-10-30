package com.example.nacosdemo;

import com.example.nacosdemo.util.redis.RedisFactory;
import com.example.nacosdemo.util.redis.RedisUtil;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class NacosdemoApplicationTests {
    private static final Logger log = LoggerFactory.getLogger(NacosdemoApplicationTests.class);

    @Resource
    private RedisFactory redisFactory;

    @Test
    void contextLoads() {
        boolean set = redisFactory.set("11111", "11111", 180);
        if(set) {
            log.info("=============成功=============");
        }
    }


}
