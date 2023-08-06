package com.CRM.springboot.service;

import com.CRM.springboot.dao.CustomerRepository;
import com.CRM.springboot.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerServiceImp implements CustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImp(CustomerRepository theCustomerRepository) {
        customerRepository = theCustomerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAllByOrderByNameAsc();
    }

    @Override
    public Customer findById(int theId) {
        Optional<Customer> result = customerRepository.findById(theId);

        Customer theCustomer = null;

        if (result.isPresent()) {
            theCustomer = result.get();
        }
        else {
            throw new RuntimeException("Did not find customer id - " + theId);
        }

        return theCustomer;
    }

    @Override
    public void save(Customer theCustomer) {
        customerRepository.save(theCustomer);
    }

    @Override
    public void deleteById(int theId) {
        customerRepository.deleteById(theId);
    }
}
