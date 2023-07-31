package com.mahedi.shopmongodb.service;

import com.mahedi.shopmongodb.controller.CustomerController;
import com.mahedi.shopmongodb.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer saveCustomer(Customer customer);

    List<Customer> getAllCustomers();
}
