package com.example.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Warehouse {

    @Id
    @GeneratedValue
    private int warehouseId;

    private String warehouseCode;

    private String warehouseCity;

    private String warehouseCountry;

    private String warehouseState;

    private String managerName;

    private String managerContactNumber;
}
