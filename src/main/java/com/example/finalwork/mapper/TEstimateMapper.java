package com.example.finalwork.mapper;

import com.example.finalwork.view.TEstimate;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TEstimateMapper {
    int deleteByPrimaryKey(Integer estimateid);

    int insert(TEstimate record);

    int insertSelective(TEstimate record);

    TEstimate selectByPrimaryKey(Integer estimateid);

    int updateByPrimaryKeySelective(TEstimate record);

    int updateByPrimaryKey(TEstimate record);
}