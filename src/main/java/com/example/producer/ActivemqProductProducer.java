package com.example.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Queue;

@Service
public class ActivemqProductProducer implements ActivemqProductSendMessage {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue productActiveMQQueue;


    @Override
    public void sendMessage(Object message) {

        this.jmsMessagingTemplate.convertAndSend(this.productActiveMQQueue,message);
    }
}
