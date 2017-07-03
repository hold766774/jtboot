package com.jtthink.Util;

import org.apache.ibatis.jdbc.SQL;

/**
 * Created by 覃雪平 on 2017/6/27.
 */
public class DBHelper {
    public String insert_user_login()
    {
        SQL sqlBuilder=new SQL();
        sqlBuilder.INSERT_INTO("user")
                .VALUES("username,userpwd","#{username},#{userpwd}");
        return sqlBuilder.toString();
    }
}
