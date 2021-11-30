package com.example.repository;

import com.example.entity.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="unit",collectionResourceRel = "unit")
public interface UnitRepository extends JpaRepository<Unit, Integer> {
}
