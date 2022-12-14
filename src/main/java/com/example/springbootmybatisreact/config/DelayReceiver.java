package com.example.springbootmybatisreact.config;

import com.example.springbootmybatisreact.entity.Order;
import com.example.springbootmybatisreact.service.OrderService;
import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

// 接收者 --消费者
@Component
@Slf4j
public class DelayReceiver {

    @Autowired
    OrderService service;

    @RabbitListener(queues = {DelayRabbitConfig.ORDER_QUEUE_NAME})
    public void orderDelayQueue(Order order, Message message, Channel channel) {
        log.info("###########################################");
        log.info("【orderDelayQueue 监听的消息】 - 【消费时间】 - [{}]- 【订单内容】 - [{}]", new Date(), order.toString());
        if (order.getOrderStatus() == 0) {
            order.setOrderStatus(2);
            log.info("【该订单未支付，取消订单】" + order.toString());
        } else if (order.getOrderStatus() == 1) {
            log.info("【该订单已完成支付】");
            service.saveOrder(order);

        } else if (order.getOrderStatus() == 2) {
            log.info("【该订单已取消】");
        }
    }
}
