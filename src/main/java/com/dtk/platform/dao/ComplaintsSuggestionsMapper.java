package com.dtk.platform.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dtk.platform.bean.ComplaintsSuggestions;
import com.dtk.platform.bean.ComplaintsSuggestionsExample;

public interface ComplaintsSuggestionsMapper {
    long countByExample(ComplaintsSuggestionsExample example);

    int deleteByExample(ComplaintsSuggestionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComplaintsSuggestions record);

    int insertSelective(ComplaintsSuggestions record);

    List<ComplaintsSuggestions> selectByExample(ComplaintsSuggestionsExample example);

    ComplaintsSuggestions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComplaintsSuggestions record, @Param("example") ComplaintsSuggestionsExample example);

    int updateByExample(@Param("record") ComplaintsSuggestions record, @Param("example") ComplaintsSuggestionsExample example);

    int updateByPrimaryKeySelective(ComplaintsSuggestions record);

    int updateByPrimaryKey(ComplaintsSuggestions record);
}