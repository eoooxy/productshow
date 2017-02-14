package com.ahoo.service.impl;

import com.ahoo.entity.TfglxmsEntity;
import com.ahoo.mapper.TfgEntityMapper;
import com.ahoo.mapper.TfglxmsEntityMapper;
import com.ahoo.service.TfglxmsService;
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
public class TfglxmsServiceImpl implements TfglxmsService {


    @Autowired
    TfglxmsEntityMapper tfglxmsEntityMapper;

    @Override
    public TfglxmsEntity selectById(int id) {
        return tfglxmsEntityMapper.selectByPrimaryKey(id);
    }

    @Override
    public TfglxmsEntity selectByFkId(int fkId) {
        return tfglxmsEntityMapper.selectByFkId(fkId);
    }

    @Override
    public int add(TfglxmsEntity entity) {
        return tfglxmsEntityMapper.insertSelective(entity);
    }

    @Override
    public int update(TfglxmsEntity entity) {
        return tfglxmsEntityMapper.updateByPrimaryKey(entity);
    }

    @Override
    public int del(int id) {
        return tfglxmsEntityMapper.deleteByPrimaryKey(id);
    }
}
