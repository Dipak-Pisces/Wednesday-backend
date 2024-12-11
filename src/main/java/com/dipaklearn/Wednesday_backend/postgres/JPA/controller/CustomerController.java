package com.dipaklearn.Wednesday_backend.postgres.JPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import com.dipaklearn.Wednesday_backend.postgres.JPA.entity.CustomerDetails;
import com.dipaklearn.Wednesday_backend.postgres.JPA.service.CustomerService;

@RestController
@RequestMapping("/Test")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer")
    public List<CustomerDetails> getUsers(){
        System.out.println("Here...");
        return customerService.getAllCustomers();
    }
}
