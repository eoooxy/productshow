package com.ahoo.service.impl;

import com.ahoo.entity.ProductParameterPicUrlEntity;
import com.ahoo.mapper.ProductParameterPicUrlEntityMapper;
import com.ahoo.service.ProductParameterPicUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xueyuan
 * @dater 2017-1-5 0005.
 */

@Service
public class ProductParameterPicUrlServiceImpl implements ProductParameterPicUrlService {


    @Autowired
    ProductParameterPicUrlEntityMapper productParameterPicUrlEntityMapper;

    @Override
    public ProductParameterPicUrlEntity selectByFkId(int fkId) {
        return productParameterPicUrlEntityMapper.selectByPrimaryKey(1);
    }
}
