package com.ahoo.convert;

import com.ahoo.dto.SupProductParameterDto;
import com.ahoo.entity.SupProductParameterEntity;
import com.ahoo.util.BeanPropertiesCopy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xueyuan
 * @dater 2017-1-5 0005.
 */
public class SupProductParameterConvert {

    public static SupProductParameterDto convertFromEntity(SupProductParameterEntity entity) {
        SupProductParameterDto dto = new SupProductParameterDto();
        try {
            BeanPropertiesCopy.propertiesCopy(entity, dto);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return dto;
    }

    public static List<SupProductParameterDto> convertFromEntity(List<SupProductParameterEntity> entities) {
        List<SupProductParameterDto> dtos = new ArrayList<>();
        dtos.addAll(entities.stream().map(SupProductParameterConvert::convertFromEntity).collect(Collectors.toList()));
        return dtos;
    }


    public static SupProductParameterEntity convertFromDto(SupProductParameterDto dto) {
        SupProductParameterEntity entity = new SupProductParameterEntity();
        try {
            BeanPropertiesCopy.propertiesCopy(dto, entity);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return entity;
    }

    public static List<SupProductParameterEntity> convertFromDto(List<SupProductParameterDto> dtos) {
        List<SupProductParameterEntity> entities = new ArrayList<>();
        entities.addAll(dtos.stream().map(SupProductParameterConvert::convertFromDto).collect(Collectors.toList()));
        return entities;
    }
}
