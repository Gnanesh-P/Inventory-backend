package com.example.repository;

import com.example.entity.ApplicationParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="applicationParameter",collectionResourceRel = "applicationParameter")
public interface ApplicationParameterRepository extends JpaRepository<ApplicationParameter, Integer> {
}
