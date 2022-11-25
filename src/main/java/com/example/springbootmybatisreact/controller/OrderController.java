package com.example.springbootmybatisreact.controller;


import com.example.springbootmybatisreact.config.DelaySender;
import com.example.springbootmybatisreact.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private DelaySender delaySender;

    @GetMapping("/sendDelay")
    public Object sendDelay() {

        Order order1 = new Order();
        order1.setOrderStatus(0);
        order1.setOrderName("三体1");

        Order order2 = new Order();
        order2.setOrderStatus(1);
        order2.setOrderName("三体1");

        Order order3 = new Order();
        order3.setOrderStatus(2);
        order3.setOrderName("三体1");

        delaySender.sendDelay(order1);
        delaySender.sendDelay(order2);
        delaySender.sendDelay(order3);

        return "sendDelay--ok";
    }
}

