package com.example.finalwork.service.impl;

import com.example.finalwork.mapper.TCourseMapper;
import com.example.finalwork.service.CourseService;
import com.example.finalwork.view.TCourse;
import com.example.finalwork.vo.TCourseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    TCourseMapper tCourseMapper;

    @Override
    public List<TCourseVO> selectTCourseVOByTeacherID(Integer teacherid) {
        List<TCourseVO> courseVOList = tCourseMapper.selectTCourseVOByTeacherID(teacherid);
        return courseVOList;
    }

    @Override
    public List<TCourseVO> selectTCourseVOByStudentID(Integer studentid) {
        List<TCourseVO> courseVOList = tCourseMapper.selectTCourseVOByStudentID(studentid);
        return courseVOList;
    }

    @Override
    public int insertCourse(TCourse tCourse){
        return tCourseMapper.insertSelective(tCourse);
    }

    @Override
    public int deleteCourse(Integer courseid) {
        return tCourseMapper.deleteByPrimaryKey(courseid);
    }

    @Override
    public int upDateCourse(TCourse tCourse) {
        return tCourseMapper.updateByPrimaryKeySelective(tCourse);
    }


}
