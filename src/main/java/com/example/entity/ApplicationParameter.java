package com.example.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class ApplicationParameter {
    private int parameterId;
    private String parameterName;
    private String parameterValue;
}
