package com.ahoo.service;

import com.ahoo.entity.ProductParameterEntity;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/27 0027
 * Time: 16:49
 */
public interface ProductParameterService {

    List<ProductParameterEntity> selectProDesParam(int fkRecId);
}
