package com.example.finalwork.controller;

import com.example.finalwork.service.TeacherService;
import com.example.finalwork.view.TTeacher;
import com.example.finalwork.vo.Response;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @GetMapping("/goodTeacher")
    public Response goodTeacher(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        PageHelper.startPage(pageNum,10);
        List<TTeacher> teacherList1 = teacherService.selectByEstimate();
        PageInfo<TTeacher> teacherPageInfo = new PageInfo<>(teacherList1);
        HashMap hashMap = new HashMap();
        hashMap.put("IndexTeachers",teacherPageInfo);
        Response response = new Response();
        response.setData(hashMap);
        return response;
    }
    @GetMapping("/newTeacher")
    public Response newTeacher(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        PageHelper.startPage(pageNum,10);
        List<TTeacher> teacherList2 = teacherService.selectByJoinTime();
        PageInfo<TTeacher> teacherPageInfo = new PageInfo<>(teacherList2);
        HashMap hashMap = new HashMap();
        hashMap.put("IndexTeachers",teacherPageInfo);
        Response response = new Response();
        response.setData(hashMap);
        return response;
    }
}
