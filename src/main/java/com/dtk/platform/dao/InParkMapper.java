package com.dtk.platform.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dtk.platform.bean.InPark;
import com.dtk.platform.bean.InParkExample;

public interface InParkMapper {
    long countByExample(InParkExample example);

    int deleteByExample(InParkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InPark record);

    int insertSelective(InPark record);

    List<InPark> selectByExample(InParkExample example);

    InPark selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InPark record, @Param("example") InParkExample example);

    int updateByExample(@Param("record") InPark record, @Param("example") InParkExample example);

    int updateByPrimaryKeySelective(InPark record);

    int updateByPrimaryKey(InPark record);
}