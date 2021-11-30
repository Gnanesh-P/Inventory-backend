package com.example.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Employee {
    @Id
    private int employeeId;

    private String employeeCode;

    private String employeeName;

    private String contactNumber;

    private String role;

}
