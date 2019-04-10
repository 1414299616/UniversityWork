package com.example.finalwork.service.impl;

import com.example.finalwork.mapper.TStudentMapper;
import com.example.finalwork.service.StudentService;
import com.example.finalwork.view.TStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    TStudentMapper tStudentMapper;

    @Override
    public TStudent studentLogin(String studentPhone) {
        TStudent resultStudent = tStudentMapper.studentLogin(studentPhone);
        return resultStudent;
    }

    @Override
    public TStudent get(Integer id) {
        return null;
    }

    @Override
    public void add(TStudent tStudent) {

    }

    @Override
    public int update(TStudent tStudent) {
        return 0;
    }

    @Override
    public int batchUpdate(List<TStudent> tstudentList) {
        return 0;
    }

    @Override
    public int detele(Integer id) {
        return 0;
    }
}
