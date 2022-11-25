package com.example.springbootmybatisreact.service;

import com.example.springbootmybatisreact.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderService {

    public void saveOrder(Order order){

        log.info("【该订单已保存】");
    }

}
