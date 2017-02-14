package com.ahoo.service.impl;

import com.ahoo.entity.LzjdEntity;
import com.ahoo.mapper.LzjdEntityMapper;
import com.ahoo.service.LzjdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/2/11 0011
 * Time: 18:36
 */

@Service
public class LzjdServiceImpl implements LzjdService {

    @Autowired
    LzjdEntityMapper lzjdEntityMapper;

    @Override
    public LzjdEntity selectById(int id) {
        return lzjdEntityMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<LzjdEntity> selectByFkId(int fkId) {
        return lzjdEntityMapper.selectByFkId(fkId);
    }

    @Override
    public List<LzjdEntity> selectParam(int fkRecId, String paramA,String paramB) {

        Map map = new HashMap();
        map.put("fkRecId", fkRecId);
        map.put("paramA", paramA);
        map.put("paramB", paramB);
        return lzjdEntityMapper.selectParam(map);
    }

    @Override
    public int add(LzjdEntity entity) {
        return lzjdEntityMapper.insertSelective(entity);
    }

    @Override
    public int update(LzjdEntity entity) {
        return lzjdEntityMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int del(int id) {
        return lzjdEntityMapper.deleteByPrimaryKey(id);
    }
}
