package com.ahoo.service.impl;

import com.ahoo.entity.ChildSeriesProDesEntity;
import com.ahoo.mapper.ChildSeriesProDesEntityMapper;
import com.ahoo.service.ChildSeriesProDesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xueyuan
 * @dater 2017-1-3 0003.
 */

@Service
public class ChildSeriesProDesServiceImpl implements ChildSeriesProDesService {


    @Autowired
    ChildSeriesProDesEntityMapper childSeriesProDesEntityMapper;

    @Override
    public ChildSeriesProDesEntity selectById(int id) {
        ChildSeriesProDesEntity entity = childSeriesProDesEntityMapper.selectByPrimaryKey(id);

        return entity;
    }

    @Override
    public ChildSeriesProDesEntity selectByFkId(int fkId) {
        ChildSeriesProDesEntity entity = childSeriesProDesEntityMapper.selectByFkId(fkId);

        return entity;
    }

    @Override
    public int addPro(ChildSeriesProDesEntity entity) {
        return childSeriesProDesEntityMapper.insertSelective(entity);
    }

    @Override
    public int updatePro(ChildSeriesProDesEntity entity) {
        return childSeriesProDesEntityMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int del(int pkRecId) {
        return childSeriesProDesEntityMapper.deleteByPrimaryKey(pkRecId);
    }
}
