package com.example.carapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carapp.model.Truck;
import com.example.carapp.service.TruckService;


@RestController
@RequestMapping("/api/v1")
public class TruckController {

    @Autowired
    private TruckService truckService;

    @GetMapping("/trucks")
    public ResponseEntity<List<Truck>> getAllTrucks() {
        return new ResponseEntity<List<Truck>>(truckService.allTrucks(), HttpStatus.OK);
    }

    @GetMapping("/truck/{id}")
    public ResponseEntity<Optional<Truck>> getSingleTruck(@PathVariable String id) {
        return new ResponseEntity<Optional<Truck>>(truckService.singleTruck(id), HttpStatus.OK);
    }

    @PostMapping("/truck/add")
    public ResponseEntity<Truck> addTruck(@RequestBody Truck newCar) {
        return new ResponseEntity<Truck>(truckService.createTruck(newCar), HttpStatus.CREATED);
    }
}
