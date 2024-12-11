package com.dipaklearn.Wednesday_backend.postgres.JPA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.dipaklearn.Wednesday_backend.postgres.JPA.entity.CustomerDetails;
import com.dipaklearn.Wednesday_backend.postgres.JPA.repository.CustomerDetailsRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerDetailsRepository customerDetailsRepository;

    public List<CustomerDetails> getAllCustomers() {
        return customerDetailsRepository.findAll();
    }
}
