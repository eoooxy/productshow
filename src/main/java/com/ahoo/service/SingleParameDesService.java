package com.ahoo.service;

import com.ahoo.entity.SingleParameDesEntity;

/**
 * @author xueyuan
 * @dater 2017-1-10 0010.
 */
public interface SingleParameDesService {

    SingleParameDesEntity selectByParame(String type,String des);
}
