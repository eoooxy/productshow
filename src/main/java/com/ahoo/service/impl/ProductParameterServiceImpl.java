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
    public List<ProductParameterEntity> selectParamB(int fkId, String paramA) {

        Map map = new HashMap<>();
        map.put("fkId", fkId);
        map.put("paramA", paramA);
        List<ProductParameterEntity> entities = productParameterEntityMapper.selectParamB(map);
        return entities;
    }

    @Override
    public List<ProductParameterEntity> selectProByParam(int fkId, String paramA, String paramB) {
        Map map = new HashMap<>();
        map.put("fkId", fkId);
        map.put("paramA", paramA);
        map.put("paramB", paramB);
        List<ProductParameterEntity> entities = productParameterEntityMapper.selectDesByParam(map);
        return entities;
    }

    @Override
    public List<ProductParameterEntity> selectProByParamPage(int fkId, String paramA, Integer page, Integer pageSize) {
        Map map = new HashMap<>();
        map.put("fkId", fkId);
        map.put("paramA", paramA);
        map.put("page", page);
        map.put("pageSize", pageSize);
        List<ProductParameterEntity> entities = productParameterEntityMapper.selectDesByParamPage(map);
        return entities;
    }

    @Override
    public ProductParameterEntity selectByPkId(int pkRecId) {

        return productParameterEntityMapper.selectByPrimaryKey(pkRecId);
    }

    @Override
    public int addPro(ProductParameterEntity entity) {
        return productParameterEntityMapper.insertSelective(entity);
    }

    @Override
    public int updatePro(ProductParameterEntity entity) {
        return productParameterEntityMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int del(int pkRecId) {
        return productParameterEntityMapper.deleteByPrimaryKey(pkRecId);
    }

}
