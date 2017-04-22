package com.ssm.dao;

import com.ssm.pojo.UserT;
import com.ssm.pojo.UserTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTMapper {
    long countByExample(UserTExample example);

    int deleteByExample(UserTExample example);

    int deleteByPrimaryKey(String openid);

    int insert(UserT record);

    int insertSelective(UserT record);

    List<UserT> selectByExample(UserTExample example);

    UserT selectByPrimaryKey(String openid);

    int updateByExampleSelective(@Param("record") UserT record, @Param("example") UserTExample example);

    int updateByExample(@Param("record") UserT record, @Param("example") UserTExample example);

    int updateByPrimaryKeySelective(UserT record);

    int updateByPrimaryKey(UserT record);
}