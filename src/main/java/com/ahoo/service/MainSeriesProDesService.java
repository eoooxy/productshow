package com.ahoo.service;

import com.ahoo.entity.MainSeriesProDesEntity;

/**
 * @author xueyuan
 * @dater 2017-1-3 0003.
 */
public interface MainSeriesProDesService {

    MainSeriesProDesEntity selectById(int id);

    MainSeriesProDesEntity selectByFkId(int fkId);

    int addPro(MainSeriesProDesEntity entity);

    int updatePro(MainSeriesProDesEntity entity);

    int del(int pkRecId);
}
