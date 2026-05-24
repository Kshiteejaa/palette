package com.kshitija.palette.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    private String artworkName;
    private Double price;
    private String customerName;
    private String status;

    public Order() {
    }

    public Order(Long id, String artworkName,
                 Double price,
                 String customerName) {
        this.id = id;
        this.artworkName = artworkName;
        this.price = price;
        this.customerName = customerName;
    }

    public Long getId() {
        return id;
    }

    public String getArtworkName() {
        return artworkName;
    }

    public void setArtworkName(String artworkName) {
        this.artworkName = artworkName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}