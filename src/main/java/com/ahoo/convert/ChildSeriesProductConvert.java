package com.ahoo.convert;

import com.ahoo.dto.ChildSeriesProductDto;
import com.ahoo.entity.ChildSeriesProductEntity;
import com.ahoo.util.BeanPropertiesCopy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/26 0026
 * Time: 21:19
 */
public class ChildSeriesProductConvert {

    public static ChildSeriesProductDto.ChildSeriesProduct convertFromEntity(ChildSeriesProductEntity entity) {
        ChildSeriesProductDto.ChildSeriesProduct dto = new ChildSeriesProductDto.ChildSeriesProduct();
        try {
            BeanPropertiesCopy.propertiesCopy(entity, dto);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return dto;
    }

    public static List<ChildSeriesProductDto.ChildSeriesProduct> convertFromEntity(List<ChildSeriesProductEntity> entities) {
        List<ChildSeriesProductDto.ChildSeriesProduct> dtos = new ArrayList<>();
        dtos.addAll(entities.stream().map(ChildSeriesProductConvert::convertFromEntity).collect(Collectors.toList()));
        return dtos;
    }


    public static ChildSeriesProductEntity convertFromDto(ChildSeriesProductDto.ChildSeriesProduct dto) {
        ChildSeriesProductEntity entity = new ChildSeriesProductEntity();
        try {
            BeanPropertiesCopy.propertiesCopy(dto, entity);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return entity;
    }

    public static List<ChildSeriesProductEntity> convertFromDto(List<ChildSeriesProductDto.ChildSeriesProduct> dtos) {
        List<ChildSeriesProductEntity> entities = new ArrayList<>();
        entities.addAll(dtos.stream().map(ChildSeriesProductConvert::convertFromDto).collect(Collectors.toList()));
        return entities;
    }


}
