package com.dtk.platform.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dtk.platform.bean.ParkInfo;
import com.dtk.platform.bean.ParkInfoExample;

public interface ParkInfoMapper {
    long countByExample(ParkInfoExample example);

    int deleteByExample(ParkInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ParkInfo record);

    int insertSelective(ParkInfo record);

    List<ParkInfo> selectByExample(ParkInfoExample example);

    ParkInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ParkInfo record, @Param("example") ParkInfoExample example);

    int updateByExample(@Param("record") ParkInfo record, @Param("example") ParkInfoExample example);

    int updateByPrimaryKeySelective(ParkInfo record);

    int updateByPrimaryKey(ParkInfo record);
}