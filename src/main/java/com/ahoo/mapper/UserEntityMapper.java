package com.ahoo.mapper;

import com.ahoo.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityMapper {
    int deleteByPrimaryKey(Integer recId);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer recId);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);

    UserEntity selectByUserNameAndPassWd(UserEntity entity);

    int updateByName(UserEntity entity);
}