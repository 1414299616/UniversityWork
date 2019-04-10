package com.example.finalwork.controller;

import com.example.finalwork.service.StudentService;
import com.example.finalwork.service.TeacherService;
import com.example.finalwork.view.TStudent;
import com.example.finalwork.view.TTeacher;
import com.example.finalwork.vo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {
    @Autowired
    StudentService studentService;
    @Autowired
    TeacherService teacherService;

    @PostMapping("/login")
    public Response login(@RequestParam(value = "phone") String phone,
                          @RequestParam(value = "password")String password,
                          @RequestParam(value = "identity",defaultValue = "学生")String identity){
        Response response ;
        if(identity.equals("学生")){
            TStudent resultStudent = studentService.studentLogin(phone);
            if(null == resultStudent){
                response = new Response();
                response.setCode(404);
                response.setMessage("该用户未注册");
            }else if(resultStudent.getStudentphone().equals(phone)&&resultStudent.getStudentpassword().equals(password)){
                response = new Response();
                response.setCode(200);
                response.setMessage("登陆成功");
            }else if(!resultStudent.getStudentpassword().equals(password)){
                response = new Response();
                response.setCode(501);
                response.setMessage("密码错误");
            }else{
                response = new Response();
                response.setCode(601);
                response.setMessage("登陆失败");
            }
            HashMap map = new HashMap();
            map.put("student",resultStudent);
            response.setData(map);
            return response;
        }else{
            TTeacher resultTeacher = teacherService.studengLogin(phone);
            if(null == resultTeacher){
                response = new Response();
                response.setCode(404);
                response.setMessage("该用户未注册");
            }else if(resultTeacher.getTeacherphone().equals(phone)&&resultTeacher.getTeacherpassword().equals(password)){
                response = new Response();
                response.setCode(200);
                response.setMessage("登陆成功");
            }else if(!resultTeacher.getTeacherpassword().equals(password)){
                response = new Response();
                response.setCode(501);
                response.setMessage("密码错误");
            }else{
                response = new Response();
                response.setCode(601);
                response.setMessage("登陆失败");
            }
            HashMap map = new HashMap();
            map.put("teacher",resultTeacher);
            response.setData(map);
            return response;
        }
    }
}
