package com.ahoo.mapper;

import com.ahoo.entity.LzjdEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Repository
public interface LzjdEntityMapper {
    int deleteByPrimaryKey(Integer recId);

    int insert(LzjdEntity record);

    int insertSelective(LzjdEntity record);

    LzjdEntity selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(LzjdEntity record);

    int updateByPrimaryKey(LzjdEntity record);

    List<LzjdEntity> selectParam(Map map);

    List<LzjdEntity> selectByFkId(int fkRecId);
}