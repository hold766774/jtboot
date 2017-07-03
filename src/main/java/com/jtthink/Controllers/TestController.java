package com.jtthink.Controllers;

import com.jtthink.Util.DBHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 覃雪平 on 2017/6/27.
 */
@RestController
public class TestController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test()
    {
        return new DBHelper().insert_user_login();
    }
}
