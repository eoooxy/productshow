package com.ahoo.service.impl;

import com.ahoo.entity.ChildSeriesProductEntity;
import com.ahoo.mapper.ChildSeriesProductEntityMapper;
import com.ahoo.service.ChildSeriesProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/27 0027
 * Time: 16:48
 */
@Service
public class ChildSeriesProductServiceImpl implements ChildSeriesProductService {

    @Autowired
    ChildSeriesProductEntityMapper childSeriesProductEntityMapper;

    @Override
    public List<ChildSeriesProductEntity> selectChildProductByFk(int fkRecId) {
        List<ChildSeriesProductEntity> entities = childSeriesProductEntityMapper.selectChildProductByFk(fkRecId);
        if (entities.size() > 0) {
            return entities;
        }
        return null;
    }
}
