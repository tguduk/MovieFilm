package com.turgutguduk.init;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {

    @Value("${redis.database.index}")
    private int redisDatabaseIndex;

    @Value("${redis.database.hostname}")
    private String redisDatabaseHostName;

    @Value("${redis.database.port}")
    private int redisDatabasePort;

    @Bean
    public CacheManager cacheManager(RedisTemplate redisTemplate) {
        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);

        // Number of seconds before expiration. Defaults to unlimited (0)
        cacheManager.setDefaultExpiration(300);
        return cacheManager;
    }

    @Bean
    public RedisConnectionFactory getConnection() {
        JedisConnectionFactory  factory = new JedisConnectionFactory();
        factory.setDatabase(redisDatabaseIndex);
        factory.setHostName(redisDatabaseHostName);
        factory.setPort(redisDatabasePort);
        return factory;
    }

    @Bean
    public RedisTemplate<String, Object> getRedisTemplate(RedisConnectionFactory getConnection) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(getConnection);
        return template;
    }





}
