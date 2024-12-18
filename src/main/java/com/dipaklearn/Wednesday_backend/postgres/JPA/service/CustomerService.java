package com.dipaklearn.Wednesday_backend.postgres.JPA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.dipaklearn.Wednesday_backend.postgres.JPA.entity.CustomerDetails;
import com.dipaklearn.Wednesday_backend.postgres.JPA.repository.CustomerDetailsRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerDetailsRepository customerDetailsRepository;

    public List<CustomerDetails> getAllCustomers() {

        return customerDetailsRepository.findAll();
    }

    public CustomerDetails getByName(String name){

        CustomerDetails cs =  customerDetailsRepository.findByFirstName(name);
        System.out.println(cs.toString());
        return cs;
    }

    public ResponseEntity<?> getById(Integer id){

        Optional<CustomerDetails> cs =  customerDetailsRepository.findById(id);

        if (cs.isPresent()){
            System.out.println(cs.toString());
        }else{
            System.out.println();
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(cs, HttpStatus.OK);
    }

    public ResponseEntity<?> addCustomer(CustomerDetails customerDetails){
        CustomerDetails saved = customerDetailsRepository.save(customerDetails);

        if (saved != null){
            return new ResponseEntity(saved,HttpStatus.OK);
        }
        return new ResponseEntity(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
