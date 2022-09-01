package com.adrian.accessingmongodb;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface CustomerRepository extends MongoRepository<Customer, String> {
    public List<Customer> findByLastName(String lastName);
}
