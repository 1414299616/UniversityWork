package com.example.finalwork.view;

import java.util.Date;

public class TCourse {
    private Integer courseid;

    private String coursename;

    private String coursecondition;

    private String coursesalary;

    private Date coursecate;

    private String courseinstruction;

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getCoursecondition() {
        return coursecondition;
    }

    public void setCoursecondition(String coursecondition) {
        this.coursecondition = coursecondition == null ? null : coursecondition.trim();
    }

    public String getCoursesalary() {
        return coursesalary;
    }

    public void setCoursesalary(String coursesalary) {
        this.coursesalary = coursesalary == null ? null : coursesalary.trim();
    }

    public Date getCoursecate() {
        return coursecate;
    }

    public void setCoursecate(Date coursecate) {
        this.coursecate = coursecate;
    }

    public String getCourseinstruction() {
        return courseinstruction;
    }

    public void setCourseinstruction(String courseinstruction) {
        this.courseinstruction = courseinstruction == null ? null : courseinstruction.trim();
    }
}