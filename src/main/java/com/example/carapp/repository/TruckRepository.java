package com.example.carapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.carapp.model.Truck;

@Repository
public interface TruckRepository extends MongoRepository<Truck, String> {
    
}
