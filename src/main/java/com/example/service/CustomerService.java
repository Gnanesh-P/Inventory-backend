package com.example.service;

import com.example.entity.Customer;
import com.example.entity.Location;
import com.example.repository.CustomerRepositry;
import com.example.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepositry customerRepositry;

    public Customer insert(Customer customer) {
        return customerRepositry.save(customer);
    }


    public Optional<Customer> findById(int id) {
        return customerRepositry.findById(id);
    }

    public Iterable<Customer> findAll() {
        return customerRepositry.findAll();
    }

    public void updateCustomer(Customer customer) {

        customerRepositry.save(customer);
    }

    public void deleteCustomer(Customer customer) {

        customerRepositry.delete(customer);
    }
}
