package com.example.repository;

import com.example.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="transaction",collectionResourceRel = "transaction")
public interface TransactionRepository  extends JpaRepository<Transaction, String> {
}
