package com.example.finalwork.view;

import java.util.Date;

public class TTeacher {
    private Integer teacherid;

    private String teacherphoto;

    private String teachernickname;

    private String teacherrealname;

    private String teacheridentityid;

    private String teachersex;

    private String teachereducationbackground;

    private Date teacherjointime;

    private Date teacherbirthday;

    private String teacherphone;

    private String teacheradress;

    private String teacherintroduce;

    private String teacherpassword;

    private Integer teachergrade;

    private Float teacherestimate;

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeacherphoto() {
        return teacherphoto;
    }

    public void setTeacherphoto(String teacherphoto) {
        this.teacherphoto = teacherphoto == null ? null : teacherphoto.trim();
    }

    public String getTeachernickname() {
        return teachernickname;
    }

    public void setTeachernickname(String teachernickname) {
        this.teachernickname = teachernickname == null ? null : teachernickname.trim();
    }

    public String getTeacherrealname() {
        return teacherrealname;
    }

    public void setTeacherrealname(String teacherrealname) {
        this.teacherrealname = teacherrealname == null ? null : teacherrealname.trim();
    }

    public String getTeacheridentityid() {
        return teacheridentityid;
    }

    public void setTeacheridentityid(String teacheridentityid) {
        this.teacheridentityid = teacheridentityid == null ? null : teacheridentityid.trim();
    }

    public String getTeachersex() {
        return teachersex;
    }

    public void setTeachersex(String teachersex) {
        this.teachersex = teachersex == null ? null : teachersex.trim();
    }

    public String getTeachereducationbackground() {
        return teachereducationbackground;
    }

    public void setTeachereducationbackground(String teachereducationbackground) {
        this.teachereducationbackground = teachereducationbackground == null ? null : teachereducationbackground.trim();
    }

    public Date getTeacherjointime() {
        return teacherjointime;
    }

    public void setTeacherjointime(Date teacherjointime) {
        this.teacherjointime = teacherjointime;
    }

    public Date getTeacherbirthday() {
        return teacherbirthday;
    }

    public void setTeacherbirthday(Date teacherbirthday) {
        this.teacherbirthday = teacherbirthday;
    }

    public String getTeacherphone() {
        return teacherphone;
    }

    public void setTeacherphone(String teacherphone) {
        this.teacherphone = teacherphone == null ? null : teacherphone.trim();
    }

    public String getTeacheradress() {
        return teacheradress;
    }

    public void setTeacheradress(String teacheradress) {
        this.teacheradress = teacheradress == null ? null : teacheradress.trim();
    }

    public String getTeacherintroduce() {
        return teacherintroduce;
    }

    public void setTeacherintroduce(String teacherintroduce) {
        this.teacherintroduce = teacherintroduce == null ? null : teacherintroduce.trim();
    }

    public String getTeacherpassword() {
        return teacherpassword;
    }

    public void setTeacherpassword(String teacherpassword) {
        this.teacherpassword = teacherpassword == null ? null : teacherpassword.trim();
    }

    public Integer getTeachergrade() {
        return teachergrade;
    }

    public void setTeachergrade(Integer teachergrade) {
        this.teachergrade = teachergrade;
    }

    public Float getTeacherestimate() {
        return teacherestimate;
    }

    public void setTeacherestimate(Float teacherestimate) {
        this.teacherestimate = teacherestimate;
    }
}