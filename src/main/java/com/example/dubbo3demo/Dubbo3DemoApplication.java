package com.example.dubbo3demo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class Dubbo3DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Dubbo3DemoApplication.class, args);
    }

}
