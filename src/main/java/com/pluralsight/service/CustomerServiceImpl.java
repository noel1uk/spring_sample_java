package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {}

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println(("we're using constructor injection"));
        this.customerRepository = customerRepository;
    }

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("we're using setter injection");
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
