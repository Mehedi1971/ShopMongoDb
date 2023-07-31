package com.mahedi.shopmongodb.controller;

import com.mahedi.shopmongodb.model.Customer;
import com.mahedi.shopmongodb.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomerController {
    public final CustomerService customerService;
    @GetMapping("/")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomers();
    }

    @PostMapping("/")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }
}
