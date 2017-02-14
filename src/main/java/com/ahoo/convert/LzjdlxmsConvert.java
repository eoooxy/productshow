package com.ahoo.convert;

import com.ahoo.dto.LzjdlxmsDto;
import com.ahoo.entity.LzjdlxmsEntity;
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
public class LzjdlxmsConvert {

    public static LzjdlxmsDto.Lzjdlxms convertFromEntity(LzjdlxmsEntity entity) {
        LzjdlxmsDto.Lzjdlxms dto = new LzjdlxmsDto.Lzjdlxms();
        try {
            BeanPropertiesCopy.propertiesCopy(entity, dto);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return dto;
    }

    public static List<LzjdlxmsDto.Lzjdlxms> convertFromEntity(List<LzjdlxmsEntity> entities) {
        List<LzjdlxmsDto.Lzjdlxms> dtos = new ArrayList<>();
        dtos.addAll(entities.stream().map(LzjdlxmsConvert::convertFromEntity).collect(Collectors.toList()));
        return dtos;
    }


    public static LzjdlxmsEntity convertFromDto(LzjdlxmsDto.Lzjdlxms dto) {
        LzjdlxmsEntity entity = new LzjdlxmsEntity();
        try {
            BeanPropertiesCopy.propertiesCopy(dto, entity);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return entity;
    }

    public static List<LzjdlxmsEntity> convertFromDto(List<LzjdlxmsDto.Lzjdlxms> dtos) {
        List<LzjdlxmsEntity> entities = new ArrayList<>();
        entities.addAll(dtos.stream().map(LzjdlxmsConvert::convertFromDto).collect(Collectors.toList()));
        return entities;
    }
}
