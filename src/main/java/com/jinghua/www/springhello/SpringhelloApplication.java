package com.jinghua.www.springhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.jinghua.www.springhello.controller")
public class SpringhelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringhelloApplication.class, args);
    }

}
