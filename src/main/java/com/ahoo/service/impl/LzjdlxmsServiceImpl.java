package com.ahoo.service.impl;

import com.ahoo.entity.LzjdlxmsEntity;
import com.ahoo.mapper.LzjdlxmsEntityMapper;
import com.ahoo.service.LzjdlxmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/2/11 0011
 * Time: 18:38
 */
@Service
public class LzjdlxmsServiceImpl implements LzjdlxmsService {

    @Autowired
    LzjdlxmsEntityMapper lzjdlxmsEntityMapper;

    @Override
    public LzjdlxmsEntity selectById(int id) {
        return lzjdlxmsEntityMapper.selectByPrimaryKey(id);
    }

    @Override
    public LzjdlxmsEntity selectByFkId(int fkId) {
        return lzjdlxmsEntityMapper.selectByFkId(fkId);
    }

    @Override
    public int add(LzjdlxmsEntity entity) {
        return lzjdlxmsEntityMapper.insertSelective(entity);
    }

    @Override
    public int update(LzjdlxmsEntity entity) {
        return lzjdlxmsEntityMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int del(int id) {
        return lzjdlxmsEntityMapper.deleteByPrimaryKey(id);
    }
}
