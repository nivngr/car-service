package com.example.carapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carapp.model.Car;
import com.example.carapp.service.CarService;

@RestController
@RequestMapping("/api/v1")
public class CarController {
    
    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public ResponseEntity<List<Car>> getAllCars() {
        return new ResponseEntity<List<Car>>(carService.allCars(), HttpStatus.OK);
    }

    @GetMapping("/car/{id}")
    public ResponseEntity<Optional<Car>> getCar(@PathVariable String id) {
        return new ResponseEntity<Optional<Car>>(carService.singleCar(id), HttpStatus.OK);
    }

    @GetMapping("/cars/{manufacturer}")
    public ResponseEntity<List<Car>> getCarByCountry(@PathVariable String manufacturer) {
        return new ResponseEntity<List<Car>>(carService.carsOfManufacturer(manufacturer), HttpStatus.OK);
    }

    @PostMapping("/car/add")
    public ResponseEntity<Car> addCar(@RequestBody Car newCar) {
        return new ResponseEntity<Car>(carService.createCar(newCar), HttpStatus.CREATED);
    }

    @DeleteMapping("/car/delete/{id}")
    public ResponseEntity<Optional<Car>> deleteCar(@PathVariable String id) {
        return new ResponseEntity<Optional<Car>>(carService.removeCar(id), HttpStatus.NO_CONTENT);
    }

}
