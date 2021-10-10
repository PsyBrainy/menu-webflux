package com.psybrainy.MenuApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("category")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryEntity {

    @Id
    private String id;
    private String name;
    private List<ProductEntity> products;
}
