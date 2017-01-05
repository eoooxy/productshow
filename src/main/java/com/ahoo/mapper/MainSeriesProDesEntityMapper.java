package com.ahoo.mapper;

import com.ahoo.entity.MainSeriesProDesEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface MainSeriesProDesEntityMapper {
    int deleteByPrimaryKey(Integer recId);

    int insert(MainSeriesProDesEntity record);

    int insertSelective(MainSeriesProDesEntity record);

    MainSeriesProDesEntity selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(MainSeriesProDesEntity record);

    int updateByPrimaryKey(MainSeriesProDesEntity record);

    MainSeriesProDesEntity selectByFkId(Integer fkId);
}