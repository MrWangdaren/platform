package com.dtk.platform.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dtk.platform.bean.Roles;
import com.dtk.platform.bean.RolesExample;

public interface RolesMapper {
    long countByExample(RolesExample example);

    int deleteByExample(RolesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Roles record);

    int insertSelective(Roles record);

    List<Roles> selectByExample(RolesExample example);

    Roles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Roles record, @Param("example") RolesExample example);

    int updateByExample(@Param("record") Roles record, @Param("example") RolesExample example);

    int updateByPrimaryKeySelective(Roles record);

    int updateByPrimaryKey(Roles record);
}