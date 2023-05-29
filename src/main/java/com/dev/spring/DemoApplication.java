package com.dev.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration.class})
public class DemoApplication {
    public static void main(String[] args) {
        System.out.println("Hello");
        SpringApplication.run(DemoApplication.class, args);
    }
}
