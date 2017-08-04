package com.dtk.platform.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dtk.platform.bean.Operators;
import com.dtk.platform.bean.OperatorsExample;

public interface OperatorsMapper {
    long countByExample(OperatorsExample example);

    int deleteByExample(OperatorsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Operators record);

    int insertSelective(Operators record);

    List<Operators> selectByExample(OperatorsExample example);

    Operators selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Operators record, @Param("example") OperatorsExample example);

    int updateByExample(@Param("record") Operators record, @Param("example") OperatorsExample example);

    int updateByPrimaryKeySelective(Operators record);

    int updateByPrimaryKey(Operators record);
}