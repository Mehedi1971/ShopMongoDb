package com.mahedi.shopmongodb.service.impl;

import com.mahedi.shopmongodb.controller.CustomerController;
import com.mahedi.shopmongodb.model.Customer;
import com.mahedi.shopmongodb.repository.CustomerRepository;
import com.mahedi.shopmongodb.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;


    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
