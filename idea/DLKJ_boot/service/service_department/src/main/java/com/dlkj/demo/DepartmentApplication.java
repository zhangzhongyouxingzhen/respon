package com.dlkj.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.dlkj")
public class DepartmentApplication {
    public static void main(String[] args) {
        SpringApplication.run(DepartmentApplication.class,args);
    }
}
