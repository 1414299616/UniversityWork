package com.example.finalwork.mapper;

import com.example.finalwork.view.TTeach;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TTeachMapper {
    int deleteByPrimaryKey(Integer teachid);

    int insert(TTeach record);

    int insertSelective(TTeach record);

    TTeach selectByPrimaryKey(Integer teachid);

    int updateByPrimaryKeySelective(TTeach record);

    int updateByPrimaryKey(TTeach record);
}