package com.ahoo.service;

import com.ahoo.entity.ChildSeriesProductEntity;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/27 0027
 * Time: 16:48
 */
public interface ChildSeriesProductService {

    List<ChildSeriesProductEntity> selectChildProductByFk(int fkRecId);

    List<ChildSeriesProductEntity> selectChildProductByFkPage(int fkRecId, int page, int pageSize);

    ChildSeriesProductEntity selectProByPkRecId(int pkRecId);

    int addPro(ChildSeriesProductEntity entity);

    int updatePro(ChildSeriesProductEntity entity);

    int del(int pkRecId);


}
