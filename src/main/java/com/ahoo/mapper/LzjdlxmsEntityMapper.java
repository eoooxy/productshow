package com.ahoo.mapper;

import com.ahoo.entity.LzjdlxmsEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LzjdlxmsEntityMapper {
    int deleteByPrimaryKey(Integer recId);

    int insert(LzjdlxmsEntity record);

    int insertSelective(LzjdlxmsEntity record);

    LzjdlxmsEntity selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(LzjdlxmsEntity record);

    int updateByPrimaryKey(LzjdlxmsEntity record);

    LzjdlxmsEntity selectByFkId(int fkRecId);
}