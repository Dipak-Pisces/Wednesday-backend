package com.dipaklearn.Wednesday_backend.postgres.JPA.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import com.dipaklearn.Wednesday_backend.postgres.JPA.entity.CustomerDetails;
import com.dipaklearn.Wednesday_backend.postgres.JPA.service.CustomerService;

@RestController
@RequestMapping("/JantaBank")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<CustomerDetails> getUsers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/customers/name/{cname}")
    public ResponseEntity<?>  getUserByName(@PathVariable("cname") String cname){
        return new ResponseEntity<>(customerService.getByName(cname), HttpStatus.OK);
    }

    @GetMapping("/customers/id/{cid}")
    public ResponseEntity<?> getUserByName(@PathVariable("cid")  int customerId){
        return customerService.getById(customerId);
    }

    @PostMapping("/customers/add")
    public ResponseEntity<?> addCustomer(@RequestBody CustomerDetails customerDetails){
        return customerService.addCustomer(customerDetails);
    }
}
