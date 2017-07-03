package com.jtthink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 覃雪平 on 2017/6/27.
 */

@EnableAutoConfiguration
@ComponentScan({"com.jtthink","com.xiaoping"})
public class MyApp {
    public static void main(String[] args){
        SpringApplication.run(MyApp.class,args);
    }
}
