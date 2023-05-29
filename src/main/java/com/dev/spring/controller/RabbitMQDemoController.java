package com.dev.spring.controller;

import com.dev.spring.model.MenuOrder;
import com.dev.spring.publisher.RabbitMQSender;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/rabbitmq")
public class RabbitMQDemoController {

    private RabbitMQSender rabbitMQSender;

    @PostMapping(value = "/sender")
    public String producer(@RequestBody MenuOrder menuOrder) {
        rabbitMQSender.send(menuOrder);
        return "Message sent to the RabbitMQ Queue Successfully";
    }
}