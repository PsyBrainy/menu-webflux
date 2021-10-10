package com.psybrainy.MenuApp.repository;

import com.psybrainy.MenuApp.model.Products;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCrudRepository extends ReactiveCrudRepository<Products, String> {
}
