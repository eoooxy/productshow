package com.ahoo.convert;

import com.ahoo.dto.ProductParameterDto;
import com.ahoo.dto.ProductParameterDto;
import com.ahoo.entity.ProductParameterEntity;
import com.ahoo.util.BeanPropertiesCopy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xueyuan
 * @dater 2016-12-28 0028.
 */
public class ProductParameterConvert {


    public static ProductParameterDto.ProductParameter convertFromEntity(ProductParameterEntity entity) {
        ProductParameterDto.ProductParameter dto = new ProductParameterDto.ProductParameter();
        try {
            BeanPropertiesCopy.propertiesCopy(entity, dto);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return dto;
    }

    public static List<ProductParameterDto.ProductParameter> convertFromEntity(List<ProductParameterEntity> entities) {
        List<ProductParameterDto.ProductParameter> dtos = new ArrayList<>();
        dtos.addAll(entities.stream().map(ProductParameterConvert::convertFromEntity).collect(Collectors.toList()));
        return dtos;
    }


    public static ProductParameterEntity convertFromDto(ProductParameterDto.ProductParameter dto) {
        ProductParameterEntity entity = new ProductParameterEntity();
        try {
            BeanPropertiesCopy.propertiesCopy(dto, entity);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return entity;
    }

    public static List<ProductParameterEntity> convertFromDto(List<ProductParameterDto.ProductParameter> dtos) {
        List<ProductParameterEntity> entities = new ArrayList<>();
        entities.addAll(dtos.stream().map(ProductParameterConvert::convertFromDto).collect(Collectors.toList()));
        return entities;
    }

}
