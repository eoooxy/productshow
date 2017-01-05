package com.ahoo.convert;

import com.ahoo.dto.ProductParameterPicUrlDto;
import com.ahoo.entity.ProductParameterPicUrlEntity;
import com.ahoo.util.BeanPropertiesCopy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xueyuan
 * @dater 2017-1-5 0005.
 */
public class ProductParameterPicUrlConvert {


    public static ProductParameterPicUrlDto convertFromEntity(ProductParameterPicUrlEntity entity) {
        ProductParameterPicUrlDto dto = new ProductParameterPicUrlDto();
        try {
            BeanPropertiesCopy.propertiesCopy(entity, dto);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return dto;
    }

    public static List<ProductParameterPicUrlDto> convertFromEntity(List<ProductParameterPicUrlEntity> entities) {
        List<ProductParameterPicUrlDto> dtos = new ArrayList<>();
        dtos.addAll(entities.stream().map(ProductParameterPicUrlConvert::convertFromEntity).collect(Collectors.toList()));
        return dtos;
    }


    public static ProductParameterPicUrlEntity convertFromDto(ProductParameterPicUrlDto dto) {
        ProductParameterPicUrlEntity entity = new ProductParameterPicUrlEntity();
        try {
            BeanPropertiesCopy.propertiesCopy(dto, entity);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return entity;
    }

    public static List<ProductParameterPicUrlEntity> convertFromDto(List<ProductParameterPicUrlDto> dtos) {
        List<ProductParameterPicUrlEntity> entities = new ArrayList<>();
        entities.addAll(dtos.stream().map(ProductParameterPicUrlConvert::convertFromDto).collect(Collectors.toList()));
        return entities;
    }
}
