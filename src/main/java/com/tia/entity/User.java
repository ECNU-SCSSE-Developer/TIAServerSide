package com.tia.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String studentId;
    private String studentName;
    private String specialty;
    private String contacts;
    private String major;
    private Integer grade;
    // TODO: The following two items are not completed for DAO.
    private Float ranks;
//    private List<String> comments = new ArrayList<String>();

    // 和Recruitment的联系集
    private List<Recruitment> focused = new ArrayList<Recruitment>();
    private List<Recruitment> registered = new ArrayList<Recruitment>();
    private List<Recruitment> created = new ArrayList<Recruitment>();


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Float getRanks() {
        return ranks;
    }

    public void setRanks(Float ranks) {
        this.ranks = ranks;
    }

    public List<Recruitment> getFocused() {
        return focused;
    }

    public void setFocused(List<Recruitment> focused) {
        this.focused = focused;
    }

    public List<Recruitment> getRegistered() {
        return registered;
    }

    public void setRegistered(List<Recruitment> registered) {
        this.registered = registered;
    }

    public List<Recruitment> getCreated() {
        return created;
    }

    public void setCreated(List<Recruitment> created) {
        this.created = created;
    }
}
