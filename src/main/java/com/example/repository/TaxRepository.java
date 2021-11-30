package com.example.repository;

import com.example.entity.Supplier;
import com.example.entity.Tax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path="tax",collectionResourceRel = "tax")
public interface TaxRepository extends JpaRepository<Tax,Integer> {
}
