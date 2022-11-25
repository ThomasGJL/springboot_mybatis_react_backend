package com.example.springbootmybatisreact.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Order implements Serializable {

    private Integer id; // 订单id
    private Integer orderStatus; // 订单状态 0：未支付，1：已支付，2：订单已取消
    private String orderName; // 订单名字

}
