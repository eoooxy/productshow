package com.ahoo.convert;

import com.ahoo.dto.SupProductParameterUrlDto;
import com.ahoo.entity.SupProductParameterUrlEntity;
import com.ahoo.util.BeanPropertiesCopy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xueyuan
 * @dater 2017-1-5 0005.
 */
public class SupProductParameterUrlConvert {

    public static SupProductParameterUrlDto convertFromEntity(SupProductParameterUrlEntity entity) {
        SupProductParameterUrlDto dto = new SupProductParameterUrlDto();
        try {
            BeanPropertiesCopy.propertiesCopy(entity, dto);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return dto;
    }

    public static List<SupProductParameterUrlDto> convertFromEntity(List<SupProductParameterUrlEntity> entities) {
        List<SupProductParameterUrlDto> dtos = new ArrayList<>();
        dtos.addAll(entities.stream().map(SupProductParameterUrlConvert::convertFromEntity).collect(Collectors.toList()));
        return dtos;
    }


    public static SupProductParameterUrlEntity convertFromDto(SupProductParameterUrlDto dto) {
        SupProductParameterUrlEntity entity = new SupProductParameterUrlEntity();
        try {
            BeanPropertiesCopy.propertiesCopy(dto, entity);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return entity;
    }

    public static List<SupProductParameterUrlEntity> convertFromDto(List<SupProductParameterUrlDto> dtos) {
        List<SupProductParameterUrlEntity> entities = new ArrayList<>();
        entities.addAll(dtos.stream().map(SupProductParameterUrlConvert::convertFromDto).collect(Collectors.toList()));
        return entities;
    }
}
