package com.ahoo.service;

import com.ahoo.entity.ChildSeriesProDesEntity;

/**
 * @author xueyuan
 * @dater 2017-1-3 0003.
 */
public interface ChildSeriesProDesService {

    ChildSeriesProDesEntity selectById(int id);

    ChildSeriesProDesEntity selectByFkId(int fkId);

    int addPro(ChildSeriesProDesEntity entity);

    int updatePro(ChildSeriesProDesEntity entity);

    int del(int pkRecId);

}
