package com.ahoo.service;

import com.ahoo.entity.MainSeriesProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/26 0026
 * Time: 20:02
 */
public interface MainSeriesProductService {

    List<MainSeriesProductEntity> selectAllProduct();

}
