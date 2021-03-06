package com.example.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue
    private int customerId;
    private String cardNumber;
    private String customerName;
    private String mobileNumber;
    private double balance;
}
