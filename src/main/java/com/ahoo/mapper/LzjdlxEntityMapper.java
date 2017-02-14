package com.ahoo.mapper;

import com.ahoo.entity.LzjdlxEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LzjdlxEntityMapper {
    int deleteByPrimaryKey(Integer recId);

    int insert(LzjdlxEntity record);

    int insertSelective(LzjdlxEntity record);

    LzjdlxEntity selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(LzjdlxEntity record);

    int updateByPrimaryKey(LzjdlxEntity record);

    List<LzjdlxEntity> selectByAll();
}