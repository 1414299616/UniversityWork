package com.example.finalwork.mapper;

import com.example.finalwork.view.TStudent;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TStudentMapper {
    TStudent studentLogin(String studengPhone);

    int deleteByPrimaryKey(Integer studentid);

    int insert(TStudent record);

    int insertSelective(TStudent record);

    TStudent selectByPrimaryKey(Integer studentid);

    int updateByPrimaryKeySelective(TStudent record);

    int updateByPrimaryKey(TStudent record);
}