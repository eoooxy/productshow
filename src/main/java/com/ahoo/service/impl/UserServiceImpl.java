package com.ahoo.service.impl;

import com.ahoo.entity.UserEntity;
import com.ahoo.mapper.UserEntityMapper;
import com.ahoo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by eoooxy on 2017/2/19.
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserEntityMapper userEntityMapper;

    @Override
    public int isUser(UserEntity entity) {

        return userEntityMapper.selectByUserNameAndPassWd(entity).getRecId();
    }
}
