package com.example.finalwork.view;

public class TStudent {
    private Integer studentid;

    private String studentphoto;

    private String studentnickname;

    private String studentidentityid;

    private String studentrealname;

    private String studentsex;

    private String studentpassword;

    private String studentphone;

    private String studentadress;

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudentphoto() {
        return studentphoto;
    }

    public void setStudentphoto(String studentphoto) {
        this.studentphoto = studentphoto == null ? null : studentphoto.trim();
    }

    public String getStudentnickname() {
        return studentnickname;
    }

    public void setStudentnickname(String studentnickname) {
        this.studentnickname = studentnickname == null ? null : studentnickname.trim();
    }

    public String getStudentidentityid() {
        return studentidentityid;
    }

    public void setStudentidentityid(String studentidentityid) {
        this.studentidentityid = studentidentityid == null ? null : studentidentityid.trim();
    }

    public String getStudentrealname() {
        return studentrealname;
    }

    public void setStudentrealname(String studentrealname) {
        this.studentrealname = studentrealname == null ? null : studentrealname.trim();
    }

    public String getStudentsex() {
        return studentsex;
    }

    public void setStudentsex(String studentsex) {
        this.studentsex = studentsex == null ? null : studentsex.trim();
    }

    public String getStudentpassword() {
        return studentpassword;
    }

    public void setStudentpassword(String studentpassword) {
        this.studentpassword = studentpassword == null ? null : studentpassword.trim();
    }

    public String getStudentphone() {
        return studentphone;
    }

    public void setStudentphone(String studentphone) {
        this.studentphone = studentphone == null ? null : studentphone.trim();
    }

    public String getStudentadress() {
        return studentadress;
    }

    public void setStudentadress(String studentadress) {
        this.studentadress = studentadress == null ? null : studentadress.trim();
    }
}