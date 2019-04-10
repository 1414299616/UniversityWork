package com.example.finalwork.mapper;

import com.example.finalwork.view.TEmploy;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TEmployMapper {
    int deleteByPrimaryKey(Integer employid);

    int insert(TEmploy record);

    int insertSelective(TEmploy record);

    TEmploy selectByPrimaryKey(Integer employid);

    int updateByPrimaryKeySelective(TEmploy record);

    int updateByPrimaryKey(TEmploy record);
}