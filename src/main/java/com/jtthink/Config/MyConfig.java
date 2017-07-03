package com.jtthink.Config;

import com.jtthink.Service.CacheServiceX;
import com.jtthink.Service.RedisCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by 覃雪平 on 2017/6/27.
 */
@Configuration
    public class MyConfig {
        @Bean
        public RedisCache redisCache()
        {
            RedisCache r=new RedisCache("127.0.0.2","6358");
            r.setTimeout(80);
            return r;
        }
    @Bean
    public CacheServiceX cacheServiceX()
    {
        CacheServiceX x=new CacheServiceX(this.redisCache());
        return x;
    }
    @Bean
    public DataSource dataSource()
    {
        org.apache.tomcat.jdbc.pool.DataSource dataSource=new org.apache.tomcat.jdbc.pool.DataSource();

        dataSource.setUrl("jdbc:mysql://localhost/test?characterEncoding=UTF-8");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

}
