package com.ahoo.mapper;

import com.ahoo.entity.SingleProDesEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SingleProDesEntityMapper {
    int deleteByPrimaryKey(Integer recId);

    int insert(SingleProDesEntity record);

    int insertSelective(SingleProDesEntity record);

    SingleProDesEntity selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(SingleProDesEntity record);

    int updateByPrimaryKeyWithBLOBs(SingleProDesEntity record);

    int updateByPrimaryKey(SingleProDesEntity record);

    List<SingleProDesEntity> selectByParame();

    SingleProDesEntity selectOneByParame(String proType);
}