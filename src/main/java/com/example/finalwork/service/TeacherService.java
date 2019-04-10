package com.example.finalwork.service;

import com.example.finalwork.view.TTeacher;

import java.util.List;

public interface TeacherService {
    //登陆
    TTeacher studengLogin(String teacherPhone);

    //通过好评度查询
    List<TTeacher> selectByEstimate();

    //通过加入日期查询
    List<TTeacher> selectByJoinTime();

    //通过id查询
    TTeacher get(Integer id);

    //添加家教信息
    void add(TTeacher tteacher);

    //更新家教信息
    int update(TTeacher tteacher);

    //批量更新家教信息
    int batchUpdate(List<TTeacher> tteacherList);

    //删除家教信息
    int detele(Integer id);
}
