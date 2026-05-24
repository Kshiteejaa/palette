package com.kshitija.palette.listener;

import com.kshitija.palette.entity.Order;
import com.kshitija.palette.event.OrderCreatedEvent;
import com.kshitija.palette.repository.OrderRepository;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class OrderEventListener {

    private final OrderRepository repository;

    public OrderEventListener(OrderRepository repository) {
        this.repository = repository;
    }

    @EventListener
    public void handleOrderCreated(OrderCreatedEvent event) {

        System.out.println("Processing payment for order: "
                + event.getOrderId());

        Order order = repository.findById(event.getOrderId())
                .orElseThrow();

        // simulate payment success
        order.setStatus("PAID");

        repository.save(order);

        System.out.println("Payment successful for order: "
                + event.getOrderId());
    }
}