package com.ahoo.mapper;

import com.ahoo.entity.ChildSeriesProDesEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildSeriesProDesEntityMapper {
    int deleteByPrimaryKey(Integer recId);

    int insert(ChildSeriesProDesEntity record);

    int insertSelective(ChildSeriesProDesEntity record);

    ChildSeriesProDesEntity selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(ChildSeriesProDesEntity record);

    int updateByPrimaryKey(ChildSeriesProDesEntity record);

    ChildSeriesProDesEntity selectByFkId(Integer fkId);
}