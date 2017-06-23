package com.ssm.dao;

import com.ssm.pojo.user;

public interface userMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);
}