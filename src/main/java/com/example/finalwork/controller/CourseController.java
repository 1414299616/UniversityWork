package com.example.finalwork.controller;

import com.example.finalwork.service.CourseService;
import com.example.finalwork.vo.TCourseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    //通过老师id查询
    @GetMapping("/course")
    public List selectTCourseVOByTeacherID(@RequestParam(value = "teacherID",defaultValue = "null") Integer teacherID,@RequestParam(value = "studentID",defaultValue = "null") Integer studentID){
        List<TCourseVO> courseVOList;
        if(teacherID!=null&&studentID==null){
             courseVOList = courseService.selectTCourseVOByTeacherID(teacherID);
        }else{
             courseVOList = courseService.selectTCourseVOByStudentID(studentID);
        }
        return courseVOList;
    }
}
