package com.psybrainy.MenuApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {

    @Id
    private String id;
    private String name;
    private Float price;
    private Boolean status;
    private CategoryEntity category;

    @CreatedDate
    private LocalDateTime created_time;

    @LastModifiedDate
    private LocalDateTime updated_time;
}
