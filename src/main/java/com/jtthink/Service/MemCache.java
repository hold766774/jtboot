package com.jtthink.Service;

/**
 * Created by 覃雪平 on 2017/6/27.
 */
public class MemCache implements ICache {

    @Override
    public String Get(String key) {
        return "获得mem缓存，key是"+key;

    }
}
