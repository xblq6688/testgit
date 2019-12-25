package com.lol.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.swing.*;
import java.util.Date;

@SpringBootTest
/*@ContextConfiguration(classes = DemoApplicationTests.class)
@ExtendWith(SpringExtension.class)*/
class DemoApplicationTests {

    //获得容器中的Bean
    @Autowired
    Date myDate;

    @Test
    public void test(){
        System.out.println(myDate);
    }
}
