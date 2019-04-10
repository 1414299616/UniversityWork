package com.example.finalwork.mapper;

import com.example.finalwork.view.TTeacher;
import com.example.finalwork.vo.TCourseVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TTeacherMapper {
    TTeacher teacherLogin(String teacherPhone);

    List<TTeacher> selectByEstimate();

    List<TTeacher> selectByJoinTime();

    int deleteByPrimaryKey(Integer teacherid);

    int insert(TTeacher record);

    int insertSelective(TTeacher record);

    TTeacher selectByPrimaryKey(Integer teacherid);

    int updateByPrimaryKeySelective(TTeacher record);

    int updateByPrimaryKey(TTeacher record);
}