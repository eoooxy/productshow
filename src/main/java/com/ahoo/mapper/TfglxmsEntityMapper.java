package com.ahoo.mapper;

import com.ahoo.entity.TfglxmsEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface TfglxmsEntityMapper {
    int deleteByPrimaryKey(Integer recId);

    int insert(TfglxmsEntity record);

    int insertSelective(TfglxmsEntity record);

    TfglxmsEntity selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(TfglxmsEntity record);

    int updateByPrimaryKey(TfglxmsEntity record);

    TfglxmsEntity selectByFkId(int fkRecId);
}