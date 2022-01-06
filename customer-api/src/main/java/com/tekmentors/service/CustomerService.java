package com.tekmentors.service;

import com.tekmentors.model.Customer;
import com.tekmentors.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(@Autowired CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> fetchCustomers() {
        return customerRepository.findAll();
    }

    public Customer findCustomer(Long id) {
        return customerRepository.getById(id);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
