package com.xiaoping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 覃雪平 on 2017/6/27.
 */
@RestController
public class News {
    @RequestMapping(value="/new",method= RequestMethod.GET)
    public String getNew()
    {
        return "new-tets";
    }
}
