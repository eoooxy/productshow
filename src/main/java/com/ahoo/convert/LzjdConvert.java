package com.ahoo.convert;

import com.ahoo.dto.LzjdDto;
import com.ahoo.entity.LzjdEntity;
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
public class LzjdConvert {

    public static LzjdDto.Lzjd convertFromEntity(LzjdEntity entity) {
        LzjdDto.Lzjd dto = new LzjdDto.Lzjd();
        try {
            BeanPropertiesCopy.propertiesCopy(entity, dto);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return dto;
    }

    public static List<LzjdDto.Lzjd> convertFromEntity(List<LzjdEntity> entities) {
        List<LzjdDto.Lzjd> dtos = new ArrayList<>();
        dtos.addAll(entities.stream().map(LzjdConvert::convertFromEntity).collect(Collectors.toList()));
        return dtos;
    }


    public static LzjdEntity convertFromDto(LzjdDto.Lzjd dto) {
        LzjdEntity entity = new LzjdEntity();
        try {
            BeanPropertiesCopy.propertiesCopy(dto, entity);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return entity;
    }

    public static List<LzjdEntity> convertFromDto(List<LzjdDto.Lzjd> dtos) {
        List<LzjdEntity> entities = new ArrayList<>();
        entities.addAll(dtos.stream().map(LzjdConvert::convertFromDto).collect(Collectors.toList()));
        return entities;
    }
}
