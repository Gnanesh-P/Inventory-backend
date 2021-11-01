package com.example.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class BillingItems {


    private int productId;

    private int lotId;

    private boolean isTraceable;

    private int quantity;

    private double price;
}
