package com.example.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Unit {
    @Id
    private String unitCode;
    private String description;
}
