package com.example.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Transaction {

    @Id
    private String transactionId;

    @OneToOne
    @JoinColumn(name = "productId")
    private Product product;

    private int quantity;

    private Date expiryDate;

    private Date manufactureDate;

    @OneToOne
    @JoinColumn(name = "locationId")
    private Location location;
    @OneToOne
    @JoinColumn(name = "locationId")
    private Location toLocation;
    @OneToOne
    @JoinColumn(name = "locationId")
    private Location fromLocation;
    @OneToOne
    @JoinColumn(name = "warehouseId")
    private Warehouse warehouse;
    @OneToOne
    @JoinColumn(name = "warehouseId")
    private Warehouse fromWarehouse;
    @OneToOne
    @JoinColumn(name = "warehouseId")
    private Warehouse toWarehouse;

    @OneToOne
    @JoinColumn(name = "supplierId")
    private Supplier supplier;

    private  double purchasePrice;

    private int currentQuantity;

    private int newQuantity;

    private String orderReference;

    private String invoiceReference;

    private String billNUmber;

    private double salesPrice;

    private String transactionType;
}
