package com.ahoo.mapper;

import com.ahoo.entity.TfgEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TfgEntityMapper {
    int deleteByPrimaryKey(Integer recId);

    int insert(TfgEntity record);

    int insertSelective(TfgEntity record);

    TfgEntity selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(TfgEntity record);

    int updateByPrimaryKey(TfgEntity record);

    List<TfgEntity> selectByFkId(int fkRecId);

    List<TfgEntity> selectParam(Map map);
}