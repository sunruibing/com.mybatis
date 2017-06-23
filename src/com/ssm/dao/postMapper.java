package com.ssm.dao;

import com.ssm.pojo.post;

public interface postMapper {
    int deleteByPrimaryKey(Integer postid);

    int insert(post record);

    int insertSelective(post record);

    post selectByPrimaryKey(Integer postid);

    int updateByPrimaryKeySelective(post record);

    int updateByPrimaryKey(post record);
}