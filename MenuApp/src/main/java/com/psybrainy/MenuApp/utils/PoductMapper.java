package com.psybrainy.MenuApp.utils;

import com.psybrainy.MenuApp.dto.Product;
import com.psybrainy.MenuApp.entity.ProductEntity;
import org.springframework.beans.BeanUtils;

public class PoductMapper {


    public static Product entityToDto(ProductEntity entity){
        Product dto = new Product();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }
    public static ProductEntity dtoToEntity(Product dto){
        ProductEntity entity = new ProductEntity();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }
}
