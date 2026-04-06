package com.nasinfo.aws.learn.service;

import com.nasinfo.aws.learn.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrdersByUserId(String userId);
}
