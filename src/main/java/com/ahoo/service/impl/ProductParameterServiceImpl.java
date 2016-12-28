package com.ahoo.service.impl;

import com.ahoo.entity.ProductParameterEntity;
import com.ahoo.mapper.ProductParameterEntityMapper;
import com.ahoo.service.ProductParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/27 0027
 * Time: 16:49
 */
@Service
public class ProductParameterServiceImpl implements ProductParameterService{

    @Autowired
    ProductParameterEntityMapper productParameterEntityMapper;

    @Override
    public List<ProductParameterEntity> selectProDesParam(int fkRecId) {
        List<ProductParameterEntity> entities = productParameterEntityMapper.selectDesByFkId(fkRecId);
        if (entities.size() > 0) {
            return entities;
        }
        return null;
    }
}
