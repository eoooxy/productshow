package com.ahoo.mapper;

import com.ahoo.entity.ProductParameterPicUrlEntity;
import com.ahoo.entity.SupProductParameterEntity;

public interface SupProductParameterEntityMapper {
    int deleteByPrimaryKey(Integer recId);

    int insert(SupProductParameterEntity record);

    int insertSelective(SupProductParameterEntity record);

    SupProductParameterEntity selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(SupProductParameterEntity record);

    int updateByPrimaryKey(SupProductParameterEntity record);

    SupProductParameterEntity selectByFkId(Integer fkId);
}