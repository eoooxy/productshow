package com.ahoo.service.impl;

import com.ahoo.entity.TfgEntity;
import com.ahoo.mapper.TfgEntityMapper;
import com.ahoo.service.TfgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/2/11 0011
 * Time: 18:38
 */
@Service
public class TfgServiceImpl implements TfgService {

    @Autowired
    TfgEntityMapper tfgEntityMapper;


    @Override
    public TfgEntity selectById(int id) {
        return tfgEntityMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TfgEntity> selectByFkId(int fkId) {
        return tfgEntityMapper.selectByFkId(fkId);
    }

    @Override
    public List<TfgEntity> selectParam(int fkRecId, String paramA, String paramB) {

        Map map = new HashMap();
        map.put("fkRecId", fkRecId);
        map.put("paramA", paramA);
        map.put("paramB", paramB);
        return tfgEntityMapper.selectParam(map);
    }

    @Override
    public int add(TfgEntity entity) {
        return tfgEntityMapper.insertSelective(entity);
    }

    @Override
    public int update(TfgEntity entity) {
        return tfgEntityMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int del(int id) {
        return tfgEntityMapper.deleteByPrimaryKey(id);
    }
}
