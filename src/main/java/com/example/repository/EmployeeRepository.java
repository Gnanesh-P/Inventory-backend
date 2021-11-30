package com.example.repository;

import com.example.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="employee",collectionResourceRel = "employee")
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
