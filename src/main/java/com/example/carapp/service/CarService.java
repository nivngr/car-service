package com.example.carapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.carapp.repository.CarRepository;
import com.example.carapp.model.Car;

@Service
public class CarService {
    
    @Autowired
    private CarRepository carRepository;

    public List<Car> allCars() {
        return carRepository.findAll();
    }

    public Optional<Car> singleCar(String id) {
        return carRepository.findById(id);
    }

    public List<Car> carsOfManufacturer(String manufacturer) {
        return carRepository.findByManufacturer(manufacturer);
    }

    public Car createCar(Car newCar) {
        return carRepository.save(newCar);
    }

    public Optional<Car> removeCar(String id) {
        Optional<Car> car = carRepository.findById(id);
        carRepository.deleteById(id);
        return car;
    }
}
