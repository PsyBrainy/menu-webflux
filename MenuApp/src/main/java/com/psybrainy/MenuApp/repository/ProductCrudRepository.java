package com.psybrainy.MenuApp.repository;

import com.psybrainy.MenuApp.entity.ProductEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ProductCrudRepository extends ReactiveCrudRepository<ProductEntity, String> {

    Mono<ProductEntity> findByNameIgnoreCase(String name);
}
