package com.ahoo.service.impl;

import com.ahoo.entity.MainSeriesProductEntity;
import com.ahoo.mapper.MainSeriesProductEntityMapper;
import com.ahoo.service.MainSeriesProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public List<MainSeriesProductEntity> selectProductPage(int page, int pageSize) {
        Map map = new HashMap<>();
        map.put("page", page);
        map.put("pageSize", pageSize);
        List<MainSeriesProductEntity> entities = mainSeriesProductEntityMapper.selectProductPage(map);
        return entities;
    }

    @Override
    public MainSeriesProductEntity selectProByPkRecId(int pkRecId) {
        return mainSeriesProductEntityMapper.selectByPrimaryKey(pkRecId);
    }
}
