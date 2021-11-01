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
    private int id;

    private int warehouseId;

    private String warehouseLocation;

    private String warehouseAddress;

    private String managerName;

    private String managerContactNumber;
}
