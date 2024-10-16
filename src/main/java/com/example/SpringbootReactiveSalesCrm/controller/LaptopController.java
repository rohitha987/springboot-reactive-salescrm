package com.example.SpringbootReactiveSalesCrm.controller;

import com.example.SpringbootReactiveSalesCrm.model.Laptop;
import com.example.SpringbootReactiveSalesCrm.service.LaptopService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/laptops")
public class LaptopController {

    private final LaptopService laptopService;

    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @GetMapping
    public Flux<Laptop> getAllLaptops() {
        return laptopService.getAllLaptops();
    }

    @GetMapping("/{id}")
    public Mono<Laptop> getLaptopById(@PathVariable String id) {
        return laptopService.getLaptopById(id);
    }

    @PostMapping
    public Mono<Laptop> createLaptop(@RequestBody Laptop laptop) {
        return laptopService.createLaptop(laptop);
    }

    @PutMapping("/{id}")
    public Mono<Laptop> updateLaptop(@PathVariable String id, @RequestBody Laptop laptop) {
        return laptopService.updateLaptop(id, laptop);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteLaptop(@PathVariable String id) {
        return laptopService.deleteLaptop(id);
    }

    @GetMapping("/brand/{brand}")
    public Flux<Laptop> getLaptopByBrand(@PathVariable String brand) {
        return laptopService.getLaptopByBrand(brand);
    }
}

