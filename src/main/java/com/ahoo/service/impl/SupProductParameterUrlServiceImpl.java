package com.ahoo.service.impl;

import com.ahoo.entity.SupProductParameterUrlEntity;
import com.ahoo.mapper.SupProductParameterUrlEntityMapper;
import com.ahoo.service.SupProductParameterUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xueyuan
 * @dater 2017-1-5 0005.
 */

@Service
public class SupProductParameterUrlServiceImpl implements SupProductParameterUrlService {

    @Autowired
    SupProductParameterUrlEntityMapper supProductParameterUrlEntityMapper;

    @Override
    public SupProductParameterUrlEntity selectByFkId(int fkId) {
        return supProductParameterUrlEntityMapper.selectByFkId(fkId);
    }
}
