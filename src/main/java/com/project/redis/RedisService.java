package com.project.redis;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    @Cacheable(cacheNames = "redis-cache")
    public String run() throws InterruptedException{
        Thread.sleep(5000);
        return "it's working";
    }
}
