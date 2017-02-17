package com.ahoo.service.impl;

import com.ahoo.entity.SingleProDesEntity;
import com.ahoo.mapper.SingleProDesEntityMapper;
import com.ahoo.service.SingleProDesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xueyuan
 * @dater 2017/2/17.
 */

@Service
public class SingleProDesServiceImpl implements SingleProDesService {

    @Autowired
    SingleProDesEntityMapper singleProDesEntityMapper;

    @Override
    public List<SingleProDesEntity> selectByParame() {
        return singleProDesEntityMapper.selectByParame();
    }

    @Override
    public SingleProDesEntity selectById(int recId) {
        return singleProDesEntityMapper.selectByPrimaryKey(recId);
    }

    @Override
    public SingleProDesEntity selectOneByParame(String proType) {
        return singleProDesEntityMapper.selectOneByParame(proType);
    }

    @Override
    public int update(SingleProDesEntity entity) {
        return singleProDesEntityMapper.updateByPrimaryKeyWithBLOBs(entity);
    }
}
