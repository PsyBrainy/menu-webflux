package com.psybrainy.MenuApp.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("product")
@Data
@Builder
public class Products {

    @Id
    private String id;
    private String name;
    private Float price;
    private Boolean status;
}
