package com.example.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class InvoiceItem {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int invoiceItemId;

    private int productId;

    private int quantity;

    private double totalPrice;

    private int lotId;

    private boolean isTraceable;
}
