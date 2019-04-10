package com.example.finalwork.service;

import com.example.finalwork.view.TStudent;

import java.util.List;

public interface StudentService {
    //通过手机号登陆
    TStudent studentLogin(String studentPhone);

    //通过id查询
    TStudent get(Integer id);

    //添加学生信息
    void add(TStudent tStudent);

    //更新学生信息
    int update(TStudent tStudent);

    //批量更新学生信息
    int batchUpdate(List<TStudent> tstudentList);

    //删除学生信息
    int detele(Integer id);

}
