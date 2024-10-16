package com.example.SpringbootReactiveSalesCrm.service;

import com.example.SpringbootReactiveSalesCrm.model.Laptop;
import com.example.SpringbootReactiveSalesCrm.repo.LaptopRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Service
public class LaptopService {

    private final LaptopRepository laptopRepository;

    public LaptopService(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    public Flux<Laptop> getAllLaptops() {
        return laptopRepository.findAll();
    }

    public Mono<Laptop> getLaptopById(String id) {
        return laptopRepository.getLaptopById(id);
    }

    public Mono<Laptop> createLaptop(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    public Mono<Laptop> updateLaptop(String id, Laptop updatedLaptop) {
        return laptopRepository.findById(id)
                .flatMap(existingLaptop -> {
                    return laptopRepository.save(updatedLaptop);
                });
    }

    public Mono<Void> deleteLaptop(String id) {
    	System.out.println("Deleting laptop with ID: " + id);
        return laptopRepository.deleteById(id);
    }

    public Flux<Laptop> getLaptopByBrand(String brand) {
        return laptopRepository.getLaptopByBrand(brand);
    }
    
}

