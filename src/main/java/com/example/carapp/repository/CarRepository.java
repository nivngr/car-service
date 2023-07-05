package com.example.carapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.carapp.model.Car;

@Repository
public interface CarRepository extends MongoRepository<Car, String> {
    
    public List<Car> findByManufacturer(String manufacturer);
}
