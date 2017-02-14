package com.ahoo.service;

import com.ahoo.entity.LzjdlxmsEntity;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/2/9 0009
 * Time: 20:46
 */
public interface LzjdlxmsService {

    LzjdlxmsEntity selectById(int id);

    LzjdlxmsEntity selectByFkId(int fkId);

    int add(LzjdlxmsEntity entity);

    int update(LzjdlxmsEntity entity);

    int del(int id);
}
