package com.dipaklearn.Wednesday_backend.postgres.JPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipaklearn.Wednesday_backend.postgres.JPA.entity.CustomerDetails;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails,Integer> {

    CustomerDetails findByFirstName(String firstName);
    
}
