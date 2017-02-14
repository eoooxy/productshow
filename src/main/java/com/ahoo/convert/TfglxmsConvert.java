package com.ahoo.convert;

import com.ahoo.dto.TfglxmsDto;
import com.ahoo.entity.TfglxmsEntity;
import com.ahoo.util.BeanPropertiesCopy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/2/11 0011
 * Time: 18:49
 */
public class TfglxmsConvert {

    public static TfglxmsDto.Tfglxms convertFromEntity(TfglxmsEntity entity) {
        TfglxmsDto.Tfglxms dto = new TfglxmsDto.Tfglxms();
        try {
            BeanPropertiesCopy.propertiesCopy(entity, dto);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return dto;
    }

    public static List<TfglxmsDto.Tfglxms> convertFromEntity(List<TfglxmsEntity> entities) {
        List<TfglxmsDto.Tfglxms> dtos = new ArrayList<>();
        dtos.addAll(entities.stream().map(TfglxmsConvert::convertFromEntity).collect(Collectors.toList()));
        return dtos;
    }


    public static TfglxmsEntity convertFromDto(TfglxmsDto.Tfglxms dto) {
        TfglxmsEntity entity = new TfglxmsEntity();
        try {
            BeanPropertiesCopy.propertiesCopy(dto, entity);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return entity;
    }

    public static List<TfglxmsEntity> convertFromDto(List<TfglxmsDto.Tfglxms> dtos) {
        List<TfglxmsEntity> entities = new ArrayList<>();
        entities.addAll(dtos.stream().map(TfglxmsConvert::convertFromDto).collect(Collectors.toList()));
        return entities;
    }
}
