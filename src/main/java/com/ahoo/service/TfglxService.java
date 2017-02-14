package com.ahoo.service;

import com.ahoo.entity.TfglxEntity;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/2/9 0009
 * Time: 20:51
 */
public interface TfglxService {

    TfglxEntity selectById(int id);

    List<TfglxEntity> selectAll();

    int add(TfglxEntity entity);

    int update(TfglxEntity entity);

    int del(int id);
}
