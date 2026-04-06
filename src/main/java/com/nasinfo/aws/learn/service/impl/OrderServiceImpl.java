package com.nasinfo.aws.learn.service.impl;

import com.nasinfo.aws.learn.entity.Order;
import com.nasinfo.aws.learn.entity.OrderStatus;
import com.nasinfo.aws.learn.entity.OrderType;
import com.nasinfo.aws.learn.service.OrderService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public List<Order> getOrdersByUserId(String userId) {
        return List.of(
                new Order("1", "user1", OrderType.APPLIANCES, LocalDateTime.now(), LocalDateTime.now(), OrderStatus.IN_PROGRESS),
                new Order("2", "user1", OrderType.FRUIT, LocalDateTime.now(), LocalDateTime.now(), OrderStatus.CANCELLED),
                new Order("3", "user1", OrderType.GROCERIES, LocalDateTime.now(), LocalDateTime.now(), OrderStatus.RECEIVED),
                new Order("4", "user1", OrderType.GROCERIES, LocalDateTime.now(), LocalDateTime.now(), OrderStatus.CANCELLED),
                new Order("5", "user1", OrderType.APPLIANCES, LocalDateTime.now(), LocalDateTime.now(), OrderStatus.DELIVERED),
                new Order("6", "user1", OrderType.FRUIT, LocalDateTime.now(), LocalDateTime.now(), OrderStatus.DELIVERED),
                new Order("7", "user1", OrderType.FRUIT, LocalDateTime.now(), LocalDateTime.now(), OrderStatus.IN_PROGRESS)
        );
    }
}
