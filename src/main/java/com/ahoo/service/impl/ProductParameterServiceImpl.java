package com.ahoo.service.impl;

import com.ahoo.entity.ProductParameterEntity;
import com.ahoo.mapper.ProductParameterEntityMapper;
import com.ahoo.service.ProductParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/27 0027
 * Time: 16:49
 */
@Service
public class ProductParameterServiceImpl implements ProductParameterService {

    @Autowired
    ProductParameterEntityMapper productParameterEntityMapper;

    @Override
    public List<ProductParameterEntity> selectProDesParamByFkId(int fkRecId) {
        List<ProductParameterEntity> entities = productParameterEntityMapper.selectDesByFkId(fkRecId);
        if (entities.size() > 0) {
            return entities;
        }
        return null;
    }

    @Override
    public ProductParameterEntity selectParamB(int fkId, String paramA) {

        Map map = new HashMap<>();
        map.put("fkId", fkId);
        map.put("paramA", paramA);
        ProductParameterEntity entity = productParameterEntityMapper.selectParamB(map);
        return entity;
    }

    @Override
    public ProductParameterEntity selectProByParam(int fkId, String paramA, String paramB) {
        Map map = new HashMap<>();
        map.put("fkId", fkId);
        map.put("paramA", paramA);
        map.put("paramB", paramB);
        ProductParameterEntity entity = productParameterEntityMapper.selectDesByParam(map);
        return entity;
    }
}
