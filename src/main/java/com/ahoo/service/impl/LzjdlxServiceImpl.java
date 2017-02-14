package com.ahoo.service.impl;

import com.ahoo.entity.LzjdlxEntity;
import com.ahoo.mapper.LzjdlxEntityMapper;
import com.ahoo.service.LzjdlxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/2/11 0011
 * Time: 18:37
 */
@Service
public class LzjdlxServiceImpl implements LzjdlxService {

    @Autowired
    LzjdlxEntityMapper lzjdlxEntityMapper;

    @Override
    public LzjdlxEntity selectById(int id) {
        return lzjdlxEntityMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<LzjdlxEntity> selectAll() {

        return lzjdlxEntityMapper.selectByAll();
    }

    @Override
    public int add(LzjdlxEntity entity) {
        return lzjdlxEntityMapper.insertSelective(entity);
    }

    @Override
    public int update(LzjdlxEntity entity) {
        return lzjdlxEntityMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int del(int id) {
        return lzjdlxEntityMapper.deleteByPrimaryKey(id);
    }
}
