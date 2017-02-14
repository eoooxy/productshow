package com.ahoo.service;

import com.ahoo.entity.TfgEntity;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/2/9 0009
 * Time: 20:51
 */
public interface TfgService {

    TfgEntity selectById(int id);

    List<TfgEntity> selectByFkId(int fkId);

    List<TfgEntity> selectParam(int fkRecId, String paramA, String paramB);

    int add(TfgEntity entity);

    int update(TfgEntity entity);

    int del(int id);
}
