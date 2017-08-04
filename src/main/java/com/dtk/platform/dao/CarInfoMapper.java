package com.dtk.platform.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dtk.platform.bean.CarInfo;
import com.dtk.platform.bean.CarInfoExample;

public interface CarInfoMapper {
    long countByExample(CarInfoExample example);

    int deleteByExample(CarInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarInfo record);

    int insertSelective(CarInfo record);

    List<CarInfo> selectByExample(CarInfoExample example);

    CarInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarInfo record, @Param("example") CarInfoExample example);

    int updateByExample(@Param("record") CarInfo record, @Param("example") CarInfoExample example);

    int updateByPrimaryKeySelective(CarInfo record);

    int updateByPrimaryKey(CarInfo record);
}