package com.CRM.springboot.service;

import com.CRM.springboot.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById(int theId);
    void save(Customer theCustomers);
    void deleteById(int theId);

}
