package com.ahoo.convert;

import com.ahoo.dto.TfglxDto;
import com.ahoo.entity.TfglxEntity;
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
public class TfglxConvert {

    public static TfglxDto.Tfglx convertFromEntity(TfglxEntity entity) {
        TfglxDto.Tfglx dto = new TfglxDto.Tfglx();
        try {
            BeanPropertiesCopy.propertiesCopy(entity, dto);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return dto;
    }

    public static List<TfglxDto.Tfglx> convertFromEntity(List<TfglxEntity> entities) {
        List<TfglxDto.Tfglx> dtos = new ArrayList<>();
        dtos.addAll(entities.stream().map(TfglxConvert::convertFromEntity).collect(Collectors.toList()));
        return dtos;
    }


    public static TfglxEntity convertFromDto(TfglxDto.Tfglx dto) {
        TfglxEntity entity = new TfglxEntity();
        try {
            BeanPropertiesCopy.propertiesCopy(dto, entity);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return entity;
    }

    public static List<TfglxEntity> convertFromDto(List<TfglxDto.Tfglx> dtos) {
        List<TfglxEntity> entities = new ArrayList<>();
        entities.addAll(dtos.stream().map(TfglxConvert::convertFromDto).collect(Collectors.toList()));
        return entities;
    }
}
