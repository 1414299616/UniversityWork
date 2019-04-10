package com.example.finalwork.service;

import com.example.finalwork.view.TCourse;
import com.example.finalwork.vo.TCourseVO;

import java.util.List;


public interface CourseService {
    //通过教师id查询教师发布的所有课程信息，返回一个TCourseVO对象列表
    List<TCourseVO> selectTCourseVOByTeacherID(Integer teacherid);

    //通过学生id查询学生所有的选课信息，返回一个TCourseVO对象列表
    List<TCourseVO> selectTCourseVOByStudentID(Integer studentid);

    //插入一个课程信息
    int insertCourse(TCourse tCourse);

    //删除一个课程信息
    int deleteCourse(Integer courseid);

    //对一个课程信息进行更新
    int upDateCourse(TCourse tCourse);
}
