package com.jtthink.Service;

import org.springframework.stereotype.Service;

/**
 * Created by 覃雪平 on 2017/6/27.
 */
@Service
public class CacheServiceX {
    private ICache iCache;

    public ICache getiCache() {
        return iCache;
    }

    public void setiCache(ICache iCache) {
        this.iCache = iCache;
    }

    public CacheServiceX() {

    }

    public CacheServiceX(ICache iCache) {

        this.iCache = iCache;
    }

    public String getCache(String key)
    {
        return iCache.Get(key);
    }
}
