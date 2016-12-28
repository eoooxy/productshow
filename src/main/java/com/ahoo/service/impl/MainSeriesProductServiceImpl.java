package com.ahoo.service.impl;

import com.ahoo.entity.MainSeriesProductEntity;
import com.ahoo.mapper.MainSeriesProductEntityMapper;
import com.ahoo.service.MainSeriesProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/26 0026
 * Time: 20:17
 */
@Service
public class MainSeriesProductServiceImpl implements MainSeriesProductService {

    @Autowired
    MainSeriesProductEntityMapper mainSeriesProductEntityMapper;

    @Override
    public List<MainSeriesProductEntity> selectAllProduct() {
        List<MainSeriesProductEntity> entities = mainSeriesProductEntityMapper.selectAllProduct();
        if (entities.size() > 0) {
            return entities;
        }
        return null;
    }
}
