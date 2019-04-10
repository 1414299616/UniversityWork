package com.example.finalwork.service.impl;

import com.example.finalwork.mapper.TTeacherMapper;
import com.example.finalwork.service.TeacherService;
import com.example.finalwork.view.TTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TTeacherMapper tTeacherMapper;

    @Override
    public TTeacher studengLogin(String teacherPhone) {
        TTeacher resultTeacher = tTeacherMapper.teacherLogin(teacherPhone);
        return resultTeacher;
    }

    @Override
    public List<TTeacher> selectByEstimate() {
        List<TTeacher> teacherList = tTeacherMapper.selectByEstimate();
        return teacherList;
    }

    @Override
    public List<TTeacher> selectByJoinTime() {
        List<TTeacher> teacherList = tTeacherMapper.selectByJoinTime();
        return teacherList;
    }


    @Override
    public TTeacher get(Integer id) {
        return null;
    }

    @Override
    public void add(TTeacher tteacher) {

    }

    @Override
    public int update(TTeacher tteacher) {
        return 0;
    }

    @Override
    public int batchUpdate(List<TTeacher> tteacherList) {
        return 0;
    }

    @Override
    public int detele(Integer id) {
        return 0;
    }
}
