package com.ahoo.service.impl;

import com.ahoo.entity.ChildSeriesProductEntity;
import com.ahoo.mapper.ChildSeriesProductEntityMapper;
import com.ahoo.service.ChildSeriesProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/27 0027
 * Time: 16:48
 */
@Service
public class ChildSeriesProductServiceImpl implements ChildSeriesProductService {

    @Autowired
    ChildSeriesProductEntityMapper childSeriesProductEntityMapper;

    @Override
    public List<ChildSeriesProductEntity> selectChildProductByFk(int fkRecId) {
        List<ChildSeriesProductEntity> entities = childSeriesProductEntityMapper.selectChildProductByFk(fkRecId);
        if (entities.size() > 0) {
            return entities;
        }
        return null;
    }

    @Override
    public List<ChildSeriesProductEntity> selectChildProductByFkPage(int fkRecId, int page, int pageSize) {
        Map map = new HashMap<>();
        map.put("fkRecId", fkRecId);
        map.put("page", page);
        map.put("pageSize", pageSize);
        List<ChildSeriesProductEntity> entities = childSeriesProductEntityMapper.selectChildProductByFkPage(map);
        return entities;
    }

    @Override
    public ChildSeriesProductEntity selectProByPkRecId(int pkRecId) {
        return childSeriesProductEntityMapper.selectByPrimaryKey(pkRecId);
    }

    @Override
    public int addPro(ChildSeriesProductEntity entity) {
        return childSeriesProductEntityMapper.insertSelective(entity);
    }

    @Override
    public int updatePro(ChildSeriesProductEntity entity) {
        return childSeriesProductEntityMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int del(int pkRecId) {
        return childSeriesProductEntityMapper.deleteByPrimaryKey(pkRecId);
    }
}
