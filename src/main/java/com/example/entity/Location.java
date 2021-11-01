package com.example.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Location {

    @Id
    @GeneratedValue
    private int locationId;

    @ManyToOne
    @JoinColumn(name = "warehouseId")
    private Warehouse warehouse;

    private String locationCode;

    private String locationDescription;

    private String availableSpace;

    private String occupiedSpace;
}

