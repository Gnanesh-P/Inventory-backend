package com.example.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Billing {

    private int warehouseId;

    private int customerId;

    private List<BillingItems> billingItemsList;

    private double totalPrice;

    private Date date;
}
