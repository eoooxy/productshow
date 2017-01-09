package com.ahoo.service.impl;

import com.ahoo.entity.SupProductParameterEntity;
import com.ahoo.mapper.SupProductParameterEntityMapper;
import com.ahoo.service.SupProductParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xueyuan
 * @dater 2017-1-5 0005.
 */

@Service
public class SupProductParameterServiceImpl implements SupProductParameterService {


    @Autowired
    SupProductParameterEntityMapper supProductParameterEntityMapper;

    @Override
    public SupProductParameterEntity selectByFkId(int fkId) {
        return supProductParameterEntityMapper.selectByFkId(fkId);
    }
}
