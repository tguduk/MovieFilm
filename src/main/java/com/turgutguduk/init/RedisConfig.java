package com.turgutguduk.init;

import com.turgutguduk.config.SpringSessionRedisConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class RedisConfig extends SpringSessionRedisConfiguration {

    @Value("${redis.database.index}")
    private int redisDatabaseIndex;

    @Value("${redis.database.hostname}")
    private String redisDatabaseHostName;

    @Value("${redis.database.port}")
    private int redisDatabasePort;


    @Value("${redis.timeToLive}")
    private long timeToLive;

//    @Bean(name="redisTemplate")
//    public RedisTemplate<String, Object> getRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
//        RedisTemplate<String, Object> template = new RedisTemplate<>();
//        template.setConnectionFactory(redisConnectionFactory);
//        return template;
//    }
//
//    @Bean
//    public CacheManager cacheManager(RedisTemplate redisTemplate) {
//        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
//        cacheManager.setDefaultExpiration(timeToLive);
//        return cacheManager;
//    }

    @Override
    public String getRedisHost() {
        return redisDatabaseHostName;
    }

    @Override
    public String getRedisPort() {
        return String.valueOf(redisDatabasePort);
    }

    @Override
    public long getTimeToLive() {
        return timeToLive;
    }
}
