package com.ahoo.convert;

import com.ahoo.dto.LzjdlxDto;
import com.ahoo.entity.LzjdlxEntity;
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
public class LzjdlxConvert {

    public static LzjdlxDto.Lzjdlx convertFromEntity(LzjdlxEntity entity) {
        LzjdlxDto.Lzjdlx dto = new LzjdlxDto.Lzjdlx();
        try {
            BeanPropertiesCopy.propertiesCopy(entity, dto);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return dto;
    }

    public static List<LzjdlxDto.Lzjdlx> convertFromEntity(List<LzjdlxEntity> entities) {
        List<LzjdlxDto.Lzjdlx> dtos = new ArrayList<>();
        dtos.addAll(entities.stream().map(LzjdlxConvert::convertFromEntity).collect(Collectors.toList()));
        return dtos;
    }


    public static LzjdlxEntity convertFromDto(LzjdlxDto.Lzjdlx dto) {
        LzjdlxEntity entity = new LzjdlxEntity();
        try {
            BeanPropertiesCopy.propertiesCopy(dto, entity);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return entity;
    }

    public static List<LzjdlxEntity> convertFromDto(List<LzjdlxDto.Lzjdlx> dtos) {
        List<LzjdlxEntity> entities = new ArrayList<>();
        entities.addAll(dtos.stream().map(LzjdlxConvert::convertFromDto).collect(Collectors.toList()));
        return entities;
    }
}
