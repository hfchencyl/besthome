package com.besthome.besthome.dao.mapper;

import com.besthome.besthome.dao.entity.UserRoleRel;
import com.besthome.besthome.dao.entity.UserRoleRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleRelMapper {
    int countByExample(UserRoleRelExample example);

    int deleteByExample(UserRoleRelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserRoleRel record);

    int insertSelective(UserRoleRel record);

    List<UserRoleRel> selectByExample(UserRoleRelExample example);

    UserRoleRel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserRoleRel record, @Param("example") UserRoleRelExample example);

    int updateByExample(@Param("record") UserRoleRel record, @Param("example") UserRoleRelExample example);

    int updateByPrimaryKeySelective(UserRoleRel record);

    int updateByPrimaryKey(UserRoleRel record);
}