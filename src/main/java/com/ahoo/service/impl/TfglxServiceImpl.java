package com.ahoo.service.impl;

import com.ahoo.entity.TfglxEntity;
import com.ahoo.mapper.TfglxEntityMapper;
import com.ahoo.service.TfglxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/2/11 0011
 * Time: 18:39
 */
@Service
public class TfglxServiceImpl implements TfglxService {

    @Autowired
    TfglxEntityMapper tfglxEntityMapper;

    @Override
    public TfglxEntity selectById(int id) {
        return tfglxEntityMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TfglxEntity> selectAll() {
        return tfglxEntityMapper.selectByAll();
    }

    @Override
    public int add(TfglxEntity entity) {
        return tfglxEntityMapper.insertSelective(entity);
    }

    @Override
    public int update(TfglxEntity entity) {
        return tfglxEntityMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int del(int id) {
        return tfglxEntityMapper.deleteByPrimaryKey(id);
    }
}
