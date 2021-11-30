package com.example.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Unit {
    @Id
    private int unitId;
    private String unitCode;
    private double value;
}
