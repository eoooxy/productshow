package com.ahoo.service;

import com.ahoo.entity.SingleProDesEntity;

import java.util.List;

/**
 * @author xueyuan
 * @dater 2017-1-10 0010.
 */

public interface SingleProDesService {

    List<SingleProDesEntity> selectByParame();

    SingleProDesEntity selectById(int recId);

    SingleProDesEntity selectOneByParame(String proType);

    int update(SingleProDesEntity entity);


}
