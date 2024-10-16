package com.example.SpringbootReactiveSalesCrm.repo;

import com.example.SpringbootReactiveSalesCrm.model.Laptop;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface LaptopRepository extends ReactiveMongoRepository<Laptop, String> {
	Flux<Laptop> getLaptopByBrand(String brand);
	Mono<Laptop> getLaptopById(String id);
}

