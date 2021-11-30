package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="transaction",collectionResourceRel = "transaction")
public interface TransactionRepository  extends JpaRepository<TransactionRepository, String> {
}
