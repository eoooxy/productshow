package com.ahoo.mapper;

import com.ahoo.entity.ProductParameterEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductParameterEntityMapper {
    int deleteByPrimaryKey(Integer recId);

    int insert(ProductParameterEntity record);

    int insertSelective(ProductParameterEntity record);

    ProductParameterEntity selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(ProductParameterEntity record);

    int updateByPrimaryKey(ProductParameterEntity record);
}