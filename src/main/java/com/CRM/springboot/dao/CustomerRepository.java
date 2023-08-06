package com.CRM.springboot.dao;

import com.CRM.springboot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    public List<Customer> findAllByOrderByNameAsc();
}
