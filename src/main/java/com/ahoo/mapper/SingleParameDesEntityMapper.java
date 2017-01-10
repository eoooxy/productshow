package com.ahoo.mapper;

import com.ahoo.entity.SingleParameDesEntity;
import org.springframework.stereotype.Repository;

import java.util.Map;


@Repository
public interface SingleParameDesEntityMapper {

    int deleteByPrimaryKey(Integer recId);

    int insert(SingleParameDesEntity record);

    int insertSelective(SingleParameDesEntity record);

    SingleParameDesEntity selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(SingleParameDesEntity record);

    int updateByPrimaryKey(SingleParameDesEntity record);

    SingleParameDesEntity selectByParame(Map map);
}