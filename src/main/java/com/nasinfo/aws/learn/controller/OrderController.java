package com.nasinfo.aws.learn.controller;

import com.nasinfo.aws.learn.entity.Order;
import com.nasinfo.aws.learn.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/order/")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("all")
    public ResponseEntity<List<Order>> getAllOrdersByUser(@RequestParam("userId") String userId) {
        return ResponseEntity.ok(orderService.getOrdersByUserId(userId));
    }
}
