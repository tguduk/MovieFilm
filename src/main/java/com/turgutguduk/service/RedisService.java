package com.turgutguduk.service;

public interface RedisService {
    public Object getValue(String key);
    public void setValue(String key,Object value);
}
