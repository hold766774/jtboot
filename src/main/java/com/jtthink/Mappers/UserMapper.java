package com.jtthink.Mappers;

import com.jtthink.Entities.UserInfo;
import com.jtthink.Util.DBHelper;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by 覃雪平 on 2017/6/27.
 */
@Mapper
public interface UserMapper {
    @Select("select id,username,userpwd from user where id=#{uid}")
    UserInfo getUserById(@Param("uid") int id);
    @Select("select id,username,userpwd from user")
    public List<UserInfo> getAllUsers();

   // @Insert("insert into user(username,userpwd) values(#{username},#{userpwd})")
    @InsertProvider(type= DBHelper.class,method = "insert_user_login")
    @SelectKey(keyProperty = "id",before = false,resultType =int.class,statement = "select LAST_INSERT_ID()")
    public int addUser(UserInfo userInfo);
}
