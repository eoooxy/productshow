package com.ahoo.convert;

import com.ahoo.dto.TfgDto;
import com.ahoo.entity.TfgEntity;
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
public class TfgConvert {

    public static TfgDto.Tfg convertFromEntity(TfgEntity entity) {
        TfgDto.Tfg dto = new TfgDto.Tfg();
        try {
            BeanPropertiesCopy.propertiesCopy(entity, dto);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return dto;
    }

    public static List<TfgDto.Tfg> convertFromEntity(List<TfgEntity> entities) {
        List<TfgDto.Tfg> dtos = new ArrayList<>();
        dtos.addAll(entities.stream().map(TfgConvert::convertFromEntity).collect(Collectors.toList()));
        return dtos;
    }


    public static TfgEntity convertFromDto(TfgDto.Tfg dto) {
        TfgEntity entity = new TfgEntity();
        try {
            BeanPropertiesCopy.propertiesCopy(dto, entity);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return entity;
    }

    public static List<TfgEntity> convertFromDto(List<TfgDto.Tfg> dtos) {
        List<TfgEntity> entities = new ArrayList<>();
        entities.addAll(dtos.stream().map(TfgConvert::convertFromDto).collect(Collectors.toList()));
        return entities;
    }
}
