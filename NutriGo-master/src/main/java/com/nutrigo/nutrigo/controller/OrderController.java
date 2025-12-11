package com.nutrigo.nutrigo.controller;

import com.nutrigo.nutrigo.model.Order;
import com.nutrigo.nutrigo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/place")
    public Order placeOrder(@RequestBody Order order) {
        return orderService.placeOrder(order);
    }

    @GetMapping("/user/{userId}")
    public List<Order> getUserOrders(@PathVariable int userId) {
        return orderService.getOrdersByUserId(userId);
    }
}
