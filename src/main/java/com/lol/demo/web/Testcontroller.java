package com.lol.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

public class Testcontroller {

    /*@RequestMapping("/")
    public String index(){
        return "index";
    }*/

    @RequestMapping("/")
    public String test(){
        if (true){
            throw new RuntimeException("异常测试");
        }
        return "index";
     }
}
