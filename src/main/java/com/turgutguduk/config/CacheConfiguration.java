package com.turgutguduk.config;

public interface CacheConfiguration {
    abstract public String getRedisHost();

    abstract public  String getRedisPort();

    abstract public long getTimeToLive();
}
