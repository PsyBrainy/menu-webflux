package com.psybrainy.MenuApp.service;

import com.psybrainy.MenuApp.model.Products;
import com.psybrainy.MenuApp.repository.ProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    @Autowired
    private ProductCrudRepository repo;

    public Mono<Products> save(Mono<Products> product){
        return product.flatMap(repo::save);
    }

    public Mono<Products> getProduct(String id){
        return repo.findById(id);
    }
}
