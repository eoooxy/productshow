package com.ahoo.service;

import com.ahoo.entity.LzjdEntity;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2017/2/9 0009
 * Time: 20:46
 */
public interface LzjdService {

    LzjdEntity selectById(int id);

    List<LzjdEntity> selectByFkId(int fkId);

    List<LzjdEntity> selectParam(int fkRecId, String paramA,String paramB);

    int add(LzjdEntity entity);

    int update(LzjdEntity entity);

    int del(int id);
}
