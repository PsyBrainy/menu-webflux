package com.psybrainy.MenuApp.controller;

import com.psybrainy.MenuApp.model.Products;
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
    public Mono<Products> save(@RequestBody Mono<Products> product){
        return service.save(product);
    }

    @GetMapping("/{id}")
    public Mono<Products> getProduct(@PathVariable("id") String id){
        return service.getProduct(id);
    }


}
