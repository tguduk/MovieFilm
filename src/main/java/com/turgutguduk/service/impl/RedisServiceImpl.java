package com.turgutguduk.service.impl;

import com.turgutguduk.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisServiceImpl implements RedisService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public Object getValue(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    @Override
    public void setValue(String key, Object value) {
        redisTemplate.opsForValue().set(key,value);
        redisTemplate.expire(key,10, TimeUnit.SECONDS);
    }
}
