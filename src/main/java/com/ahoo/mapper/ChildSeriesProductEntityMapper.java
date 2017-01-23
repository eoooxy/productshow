package com.ahoo.mapper;

import com.ahoo.entity.ChildSeriesProductEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ChildSeriesProductEntityMapper {
    int deleteByPrimaryKey(Integer recId);

    int insert(ChildSeriesProductEntity record);

    int insertSelective(ChildSeriesProductEntity record);

    ChildSeriesProductEntity selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(ChildSeriesProductEntity record);

    int updateByPrimaryKey(ChildSeriesProductEntity record);

    List<ChildSeriesProductEntity> selectChildProductByFk(int fkRecId);

    List<ChildSeriesProductEntity> selectChildProductByFkPage(Map map);
}