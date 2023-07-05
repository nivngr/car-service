package com.example.carapp.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Document
@Data
@EqualsAndHashCode(callSuper=true)
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class Truck extends Car {
    
    private boolean forPassengers;
    private int wheels;

}
