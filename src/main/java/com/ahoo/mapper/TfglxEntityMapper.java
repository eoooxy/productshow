package com.ahoo.mapper;

import com.ahoo.entity.TfglxEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TfglxEntityMapper {
    int deleteByPrimaryKey(Integer recId);

    int insert(TfglxEntity record);

    int insertSelective(TfglxEntity record);

    TfglxEntity selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(TfglxEntity record);

    int updateByPrimaryKey(TfglxEntity record);

    List<TfglxEntity> selectByAll();
}