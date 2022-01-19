package com.liuhui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 说明这是一个springboot应用
 *
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        // spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
