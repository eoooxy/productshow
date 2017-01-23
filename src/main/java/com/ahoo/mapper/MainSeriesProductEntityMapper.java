package com.ahoo.mapper;

import com.ahoo.entity.MainSeriesProductEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MainSeriesProductEntityMapper {
    int deleteByPrimaryKey(Integer recId);

    int insert(MainSeriesProductEntity record);

    int insertSelective(MainSeriesProductEntity record);

    MainSeriesProductEntity selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(MainSeriesProductEntity record);

    int updateByPrimaryKey(MainSeriesProductEntity record);

    List<MainSeriesProductEntity> selectAllProduct();

    List<MainSeriesProductEntity> selectProductPage(Map map);
}