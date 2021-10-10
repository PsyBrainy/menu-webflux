package com.psybrainy.MenuApp.controller;

import com.psybrainy.MenuApp.dto.Product;
import com.psybrainy.MenuApp.entity.ProductEntity;
import com.psybrainy.MenuApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping()
    public Mono<Product> save(@RequestBody Mono<Product> product){
        return service.save(product);
    }

    @GetMapping("/{name}")
    public Mono<Product> getProduct(@PathVariable("name") String name){
        return service.getProduct(name);
    }


}
