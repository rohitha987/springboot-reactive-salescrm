package com.example.SpringbootReactiveSalesCrm.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "laptops")
public class Laptop {
    @Id
    private Long id;
    private String brand;
    private String laptopModel;
    private double laptopPrice;
    private String ram;
    private String color;
    private String dimensions;
    private String processorType;
    private String screenSize;
    private String storage;
    private int stock;
    private String warrantyPeriod;
    private String weight;
    private String graphicCard;
    private String releaseDate;
}

