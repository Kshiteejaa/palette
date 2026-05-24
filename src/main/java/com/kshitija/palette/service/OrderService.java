package com.kshitija.palette.service;

import com.kshitija.palette.entity.Order;
import com.kshitija.palette.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public Order createOrder(Order order) {
        return repository.save(order);
    }

    public List<Order> getAllOrders() {
        return repository.findAll();
    }
}