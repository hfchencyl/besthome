package com.besthome.besthome.dao.mapper;

import com.besthome.besthome.dao.entity.ContentModule;
import com.besthome.besthome.dao.entity.ContentModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentModuleMapper {
    int countByExample(ContentModuleExample example);

    int deleteByExample(ContentModuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContentModule record);

    int insertSelective(ContentModule record);

    List<ContentModule> selectByExample(ContentModuleExample example);

    ContentModule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContentModule record, @Param("example") ContentModuleExample example);

    int updateByExample(@Param("record") ContentModule record, @Param("example") ContentModuleExample example);

    int updateByPrimaryKeySelective(ContentModule record);

    int updateByPrimaryKey(ContentModule record);
}