package com.ahoo.convert;

import com.ahoo.dto.SingleProDesDto;
import com.ahoo.entity.SingleProDesEntity;
import com.ahoo.util.BeanPropertiesCopy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xueyuan
 * @dater 2017/2/17.
 */
public class SingleProDesConvert {


    public static SingleProDesDto.SingleProDes convertFromEntity(SingleProDesEntity entity) {
        SingleProDesDto.SingleProDes dto = new SingleProDesDto.SingleProDes();
        try {
            BeanPropertiesCopy.propertiesCopy(entity, dto);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return dto;
    }

    public static List<SingleProDesDto.SingleProDes> convertFromEntity(List<SingleProDesEntity> entities) {
        List<SingleProDesDto.SingleProDes> dtos = new ArrayList<>();
        dtos.addAll(entities.stream().map(SingleProDesConvert::convertFromEntity).collect(Collectors.toList()));
        return dtos;
    }


    public static SingleProDesEntity convertFromDto(SingleProDesDto.SingleProDes dto) {
        SingleProDesEntity entity = new SingleProDesEntity();
        try {
            BeanPropertiesCopy.propertiesCopy(dto, entity);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return entity;
    }

    public static List<SingleProDesEntity> convertFromDto(List<SingleProDesDto.SingleProDes> dtos) {
        List<SingleProDesEntity> entities = new ArrayList<>();
        entities.addAll(dtos.stream().map(SingleProDesConvert::convertFromDto).collect(Collectors.toList()));
        return entities;
    }
}
