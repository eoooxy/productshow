package com.ahoo.mapper;

import com.ahoo.entity.ProductParameterEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ProductParameterEntityMapper {
    int deleteByPrimaryKey(Integer recId);

    int insert(ProductParameterEntity record);

    int insertSelective(ProductParameterEntity record);

    ProductParameterEntity selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(ProductParameterEntity record);

    int updateByPrimaryKey(ProductParameterEntity record);

    List<ProductParameterEntity>  selectDesByParam(Map map);

    List<ProductParameterEntity> selectDesByFkId(int fkRecId);

    List<ProductParameterEntity> selectParamB(Map map);
}