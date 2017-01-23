package com.ahoo.service;

import com.ahoo.entity.ProductParameterEntity;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/27 0027
 * Time: 16:49
 */
public interface ProductParameterService {

    List<ProductParameterEntity> selectProDesParamByFkId(int fkRecId);

    List<ProductParameterEntity> selectParamB(int fkId, String paramA);

    List<ProductParameterEntity> selectProByParam(int fkId, String paramA, String paramB);

    List<ProductParameterEntity> selectProByParamPage(int fkId, String paramA, Integer page, Integer pageSize);

    ProductParameterEntity selectByPkId(int pkRecId);

    int addPro(ProductParameterEntity entity);

    int updatePro(ProductParameterEntity entity);
}
