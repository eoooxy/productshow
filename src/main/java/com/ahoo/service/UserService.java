package com.ahoo.service;

import com.ahoo.entity.UserEntity;

/**
 * Created by eoooxy on 2017/2/19.
 */
public interface UserService {

    int isUser(UserEntity entity);

    int update(UserEntity entity);
}
