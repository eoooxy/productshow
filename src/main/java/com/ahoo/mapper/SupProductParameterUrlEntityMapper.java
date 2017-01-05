package com.ahoo.mapper;

import com.ahoo.entity.SupProductParameterEntity;
import com.ahoo.entity.SupProductParameterUrlEntity;

public interface SupProductParameterUrlEntityMapper {
    int deleteByPrimaryKey(Integer recId);

    int insert(SupProductParameterUrlEntity record);

    int insertSelective(SupProductParameterUrlEntity record);

    SupProductParameterUrlEntity selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(SupProductParameterUrlEntity record);

    int updateByPrimaryKey(SupProductParameterUrlEntity record);

    SupProductParameterUrlEntity selectByFkId(Integer fkId);
}