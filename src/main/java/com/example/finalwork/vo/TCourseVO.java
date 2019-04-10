package com.example.finalwork.vo;

import com.example.finalwork.view.TCourse;
import com.example.finalwork.view.TEstimate;
import com.example.finalwork.view.TTeach;
import com.example.finalwork.view.TTeacher;

import java.io.Serializable;

/**
 * 封装了前台需要显示的详细课程信息
 */
public class TCourseVO {

    private TCourse tCourse;

    private TTeach tTeach;

    private TTeacher tTeacher;

    public TCourseVO(TTeach tTeach, TCourse tCourse, TTeacher tTeacher) {
        this.tTeach = tTeach;
        this.tCourse = tCourse;
        this.tTeacher = tTeacher;
    }

    public TTeach gettTeach() {
        return tTeach;
    }

    public void settTeach(TTeach tTeach) {
        this.tTeach = tTeach;
    }

    public TCourse gettCourse() {
        return tCourse;
    }

    public void settCourse(TCourse tCourse) {
        this.tCourse = tCourse;
    }

    public TTeacher gettTeacher() {
        return tTeacher;
    }

    public void settTeacher(TTeacher tTeacher) {
        this.tTeacher = tTeacher;
    }
}
