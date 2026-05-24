package com.kshitija.palette.repository;

import com.kshitija.palette.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}