package com.ahoo.convert;

import com.ahoo.dto.MainSeriesProductDto;
import com.ahoo.entity.MainSeriesProductEntity;
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
public class MainSeriesProductConvert {

    public static MainSeriesProductDto convertFromEntity(MainSeriesProductEntity entity) {
        MainSeriesProductDto dto = new MainSeriesProductDto();
        try {
            BeanPropertiesCopy.propertiesCopy(entity, dto);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return dto;
    }

    public static List<MainSeriesProductDto> convertFromEntity(List<MainSeriesProductEntity> entities) {
        List<MainSeriesProductDto> dtos = new ArrayList<>();
        dtos.addAll(entities.stream().map(MainSeriesProductConvert::convertFromEntity).collect(Collectors.toList()));
        return dtos;
    }


    public static MainSeriesProductEntity convertFromDto(MainSeriesProductDto dto) {
        MainSeriesProductEntity entity = new MainSeriesProductEntity();
        try {
            BeanPropertiesCopy.propertiesCopy(dto, entity);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return entity;
    }

    public static List<MainSeriesProductEntity> convertFromDto(List<MainSeriesProductDto> dtos) {
        List<MainSeriesProductEntity> entities = new ArrayList<>();
        entities.addAll(dtos.stream().map(MainSeriesProductConvert::convertFromDto).collect(Collectors.toList()));
        return entities;
    }


}
