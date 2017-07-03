package com.jtthink.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

/**
 * Created by 覃雪平 on 2017/6/27.
 */
@Service
@ConfigurationProperties(prefix="cache")
public class CacheService {
 //   @Value(value="${cache.cache_type}")
 private String cache_type;
    private int cache_expire;
    private String[] cached_server;



    public String[] getCached_server() {
        return cached_server;
    }

    public void setCached_server(String[] cached_server) {
        this.cached_server = cached_server;
    }

    public String getCache_type() {
        return cache_type;
    }

    public void setCache_type(String cache_type) {
        this.cache_type = cache_type;
    }

    public int getCache_expire() {
        return cache_expire;
    }

    public void setCache_expire(int cache_expire) {

        this.cache_expire = cache_expire;
    }

    public String getCache(String key)
    {
        for (String s:this.cached_server
                ) {
            System.out.println(s);
        }
        return "得到缓存"+this.cache_type+this.cache_expire;
    }
}
