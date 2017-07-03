package com.jtthink.Controllers;

import com.jtthink.Entities.UserInfo;
import com.jtthink.Mappers.UserMapper;
import com.jtthink.Service.CacheService;
import com.jtthink.Service.CacheServiceX;
import com.jtthink.Service.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by 覃雪平 on 2017/6/27.
 */
@RestController
public class UserControllers {
    @Autowired
    CacheService cacheService;
    @Autowired
    CacheServiceX cacheServiceX;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    UserMapper userMapper;
    @RequestMapping(value="/user",method= RequestMethod.GET)
    public String getUser()
    {
       /* RedisCache redisCache=new RedisCache("127.0.0.1","6379");
        redisCache.setTimeout(70);
        CacheServiceX cacheServiceX=new CacheServiceX(redisCache);*/
        List list=jdbcTemplate.queryForList("select * from news");
        for (Object obj:list
             ) {
          System.out.print  (((Map)obj).get("news_title"));
        }
            return cacheServiceX.getCache("abc");
    }
    @RequestMapping(value="/userinfo/{uid:\\d+}",method = RequestMethod.GET)
    public UserInfo getUserInfo(@PathVariable("uid") int abc)
    {
      return   userMapper.getUserById(abc);
    }
    @RequestMapping(value="/userinfo",method = RequestMethod.POST)
    public int newUser(@RequestBody UserInfo userInfo)
    {
          userMapper.addUser(userInfo);
          return userInfo.getId();
    }
    @RequestMapping(value="/userinfo",method = RequestMethod.GET)
    public List<UserInfo> getAllUserInfo()
    {
        return   userMapper.getAllUsers();
    }


}
