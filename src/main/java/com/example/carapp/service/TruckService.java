package com.example.carapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carapp.model.Truck;
import com.example.carapp.repository.TruckRepository;

@Service
public class TruckService {
    
    @Autowired
    private TruckRepository truckRepository;

    public List<Truck> allTrucks() {
        return truckRepository.findAll();
    }

    public Optional<Truck> singleTruck(String id) {
        return truckRepository.findById(id);
    }

    public Truck createTruck(Truck newTruck) {
        return truckRepository.save(newTruck);
    }
}