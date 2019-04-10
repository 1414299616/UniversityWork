package com.example.finalwork.view;

public class TEstimate {
    private Integer estimateid;

    private Integer studentid;

    private Integer courseid;

    private String estimategrade;

    private String estimatecontent;

    public Integer getEstimateid() {
        return estimateid;
    }

    public void setEstimateid(Integer estimateid) {
        this.estimateid = estimateid;
    }

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getEstimategrade() {
        return estimategrade;
    }

    public void setEstimategrade(String estimategrade) {
        this.estimategrade = estimategrade == null ? null : estimategrade.trim();
    }

    public String getEstimatecontent() {
        return estimatecontent;
    }

    public void setEstimatecontent(String estimatecontent) {
        this.estimatecontent = estimatecontent == null ? null : estimatecontent.trim();
    }
}