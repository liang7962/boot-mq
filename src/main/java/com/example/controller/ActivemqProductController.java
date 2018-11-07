package com.example.controller;

import com.example.producer.ActivemqProductProducer;
import com.example.producer.RabbitmqProductSendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ActivemqProductController {

    @Autowired
    private ActivemqProductProducer activemqProductProducer;

    @Autowired
    private RabbitmqProductSendMessage rabbitmqProductSendMessage;

//    @RequestMapping("/{productId}")
//    public Long getById(@PathVariable final long productId) {
//
//        this.activemqProductProducer.sendMessage(productId);
//        return productId;
//    }


    @RequestMapping("/{productName}")
    public String getByName(@PathVariable final String productName) {

        this.rabbitmqProductSendMessage.sendMsg(productName);
        return productName;
    }

    @RequestMapping("sendRabbit")
    public String sendRabbit() {
        for (int i=0;i<100;i++){
            rabbitmqProductSendMessage.sendMsg("消息--"+i);
        }
        return "success";
    }
}