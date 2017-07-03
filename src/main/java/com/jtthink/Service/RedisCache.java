package com.jtthink.Service;

/**
 * Created by 覃雪平 on 2017/6/27.
 */
public class RedisCache implements ICache {
    private String ip;
    private String port;
    private int timeout=60;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public RedisCache(String ip, String port) {
        this.ip = ip;
        this.port = port;
    }

    @Override
    public String Get(String key) {
        return "获取redis缓存,key是"+key+"ip和端口是"+this.getPort()+this.getIp()+"超时时间是"+this.getTimeout();
    }
}
