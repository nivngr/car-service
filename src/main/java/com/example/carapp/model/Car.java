package com.example.carapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class Car {
    
    @Id
    private String id;
    private int year;
    private String manufacturer;
    private String model;
    private String type;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String dateSold;
}
