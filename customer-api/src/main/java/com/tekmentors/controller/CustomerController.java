package com.tekmentors.controller;

import com.tekmentors.model.Customer;
import com.tekmentors.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/")
    public ResponseEntity<List<Customer>> fetchCustomers(){
        log.info("In fetchCustomers ");
        List<Customer> customers = customerService.fetchCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @GetMapping(value = "/:id")
    public ResponseEntity<Customer> findCustomer(@PathVariable("id") Long id){
        log.info(" In findCustomerById , {}",id);
        Customer customer = customerService.findCustomer(id);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @PostMapping(value = "/")
    public ResponseEntity<Customer> createNewCustomer(@RequestBody Customer customer) {
        log.info("In create new customer : {}", customer);
         Customer newCustomer = customerService.createCustomer(customer);
         return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }

}
