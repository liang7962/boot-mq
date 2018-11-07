package com.example.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ActivemqProductConsumer {

    @JmsListener(destination = "com.example.product",containerFactory = "jmsListenerContainerQueue")
    public void receiveQueue(String text) {
        System.out.println("Consumer,productId:"+text);
    }

}