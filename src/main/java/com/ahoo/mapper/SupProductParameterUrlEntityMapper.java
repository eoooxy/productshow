package com.ahoo.mapper;

import com.ahoo.entity.SupProductParameterUrlEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface SupProductParameterUrlEntityMapper {
    int deleteByPrimaryKey(Integer recId);

    int insert(SupProductParameterUrlEntity record);

    int insertSelective(SupProductParameterUrlEntity record);

    SupProductParameterUrlEntity selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(SupProductParameterUrlEntity record);

    int updateByPrimaryKey(SupProductParameterUrlEntity record);

    SupProductParameterUrlEntity selectByFkId(Integer fkId);
}