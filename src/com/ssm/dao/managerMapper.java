package com.ssm.dao;

import com.ssm.pojo.manager;

public interface managerMapper {
    int deleteByPrimaryKey(Integer managerid);

    int insert(manager record);

    int insertSelective(manager record);

    manager selectByPrimaryKey(Integer managerid);

    int updateByPrimaryKeySelective(manager record);

    int updateByPrimaryKey(manager record);
}