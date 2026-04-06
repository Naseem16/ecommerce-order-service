package com.nasinfo.aws.learn.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String orderId;
    private String userId;
    private OrderType orderType;
    private LocalDateTime orderPlacedOn;
    private LocalDateTime estDeliveryDate;
    private OrderStatus orderStatus;
}
