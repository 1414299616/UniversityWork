package com.example.finalwork.mapper;

import com.example.finalwork.view.TCourse;
import com.example.finalwork.vo.TCourseVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TCourseMapper {

    List<TCourseVO> selectTCourseVOByTeacherID(Integer teacherid);

    List<TCourseVO> selectTCourseVOByStudentID(Integer studentid);

    int deleteByPrimaryKey(Integer courseid);

    int insert(TCourse record);

    int insertSelective(TCourse record);

    TCourse selectByPrimaryKey(Integer courseid);

    int updateByPrimaryKeySelective(TCourse record);

    int updateByPrimaryKey(TCourse record);
}