package com.lol.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration //自定义配置类
public class MyConfig {

    //配置自己的Bean

    @Bean //该Bean会纳入到Spring容器中
    public Date getDate(){
        return new Date();
    }
}
