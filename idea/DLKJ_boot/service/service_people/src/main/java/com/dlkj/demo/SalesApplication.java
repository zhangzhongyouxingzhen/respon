package com.dlkj.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@SpringBootApplication
@ComponentScan(basePackages = {"com.dlkj"})
public class SalesApplication {
    public static void main(String[] args) {
        SpringApplication.run(SalesApplication.class,args);
    }
}
