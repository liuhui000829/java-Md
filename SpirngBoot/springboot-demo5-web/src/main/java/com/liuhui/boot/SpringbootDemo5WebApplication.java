package com.liuhui.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SuppressWarnings("all")
@SpringBootApplication
@ServletComponentScan(basePackages = "com.liuhui.boot")
public class SpringbootDemo5WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo5WebApplication.class, args);
    }

}
