package com.psybrainy.MenuApp.service;

import com.psybrainy.MenuApp.dto.Product;
import com.psybrainy.MenuApp.repository.ProductCrudRepository;
import com.psybrainy.MenuApp.utils.PoductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    @Autowired
    private ProductCrudRepository repo;


    public Mono<Product> save(Mono<Product> product){
        return product
                .map(PoductMapper::dtoToEntity)
                .flatMap(repo::save)
                .map(PoductMapper::entityToDto);
    }

    public Mono<Product> getProduct(String name){
        return repo.findByNameIgnoreCase(name).map(PoductMapper::entityToDto);
    }



}
