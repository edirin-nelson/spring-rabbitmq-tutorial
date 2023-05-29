package com.dev.spring.publisher;

import com.dev.spring.model.MenuOrder;
import lombok.AllArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RabbitMQSender {

    private AmqpTemplate rabbitTemplate;
    private Queue queue;

    private static Logger logger = LogManager.getLogger(RabbitMQSender.class.toString());

    public void send(MenuOrder menuOrder) {
        rabbitTemplate.convertAndSend(queue.getName(), menuOrder);
        logger.info("Sending Message to the Queue : " + menuOrder.toString());
    }
}