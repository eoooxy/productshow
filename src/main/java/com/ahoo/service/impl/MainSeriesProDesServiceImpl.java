package com.ahoo.service.impl;

import com.ahoo.entity.MainSeriesProDesEntity;
import com.ahoo.mapper.MainSeriesProDesEntityMapper;
import com.ahoo.service.MainSeriesProDesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xueyuan
 * @dater 2017-1-3 0003.
 */
@Service
public class MainSeriesProDesServiceImpl implements MainSeriesProDesService {

    @Autowired
    MainSeriesProDesEntityMapper mainSeriesProDesEntityMapper;

    @Override
    public MainSeriesProDesEntity selectById(int id) {

        MainSeriesProDesEntity entity = mainSeriesProDesEntityMapper.selectByPrimaryKey(id);

        return entity;
    }

    @Override
    public MainSeriesProDesEntity selectByFkId(int fkId) {

        MainSeriesProDesEntity entity = mainSeriesProDesEntityMapper.selectByFkId(fkId);

        return entity;
    }

    @Override
    public int addPro(MainSeriesProDesEntity entity) {
        return mainSeriesProDesEntityMapper.insertSelective(entity);
    }

    @Override
    public int updatePro(MainSeriesProDesEntity entity) {
        return mainSeriesProDesEntityMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int del(int pkRecId) {
        return mainSeriesProDesEntityMapper.deleteByPrimaryKey(pkRecId);
    }
}
