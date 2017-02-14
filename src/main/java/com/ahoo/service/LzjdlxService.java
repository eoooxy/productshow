package com.ahoo.service;

import com.ahoo.entity.LzjdlxEntity;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/2/9 0009
 * Time: 20:46
 */
public interface LzjdlxService {

    LzjdlxEntity selectById(int id);

    List<LzjdlxEntity> selectAll();

    int add(LzjdlxEntity entity);

    int update(LzjdlxEntity entity);

    int del(int id);
}
