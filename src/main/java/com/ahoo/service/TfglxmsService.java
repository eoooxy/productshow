package com.ahoo.service;

import com.ahoo.entity.TfglxmsEntity;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/2/9 0009
 * Time: 20:51
 */
public interface TfglxmsService {

    TfglxmsEntity selectById(int id);

    TfglxmsEntity selectByFkId(int fkId);

    int add(TfglxmsEntity entity);

    int update(TfglxmsEntity entity);

    int del(int id);
}
