package com.example.controller;

import com.example.entity.Customer;
import com.example.service.CustomerService;
import com.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("")
    public Iterable<Customer> getAllSupplier() {
        return customerService.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<Customer> searchSupplier(@PathVariable int id) {
        return customerService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.insert(customer);
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateCustomer(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteCustomer(@RequestBody Customer customer) {
        customerService.deleteCustomer(customer);
    }

}
