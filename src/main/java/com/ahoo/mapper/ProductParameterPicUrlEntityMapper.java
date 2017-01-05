package com.ahoo.mapper;

import com.ahoo.entity.MainSeriesProDesEntity;
import com.ahoo.entity.ProductParameterPicUrlEntity;

public interface ProductParameterPicUrlEntityMapper {
    int deleteByPrimaryKey(Integer recId);

    int insert(ProductParameterPicUrlEntity record);

    int insertSelective(ProductParameterPicUrlEntity record);

    ProductParameterPicUrlEntity selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(ProductParameterPicUrlEntity record);

    int updateByPrimaryKey(ProductParameterPicUrlEntity record);

    ProductParameterPicUrlEntity selectByFkId(Integer fkId);
}