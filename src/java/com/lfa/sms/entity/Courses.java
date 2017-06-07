/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.sms.entity;

/**
 *
 * @author sapu
 */
public class Courses {
    private int course_id;
    private String course_name,course_code;

    public Courses() {
    }

    public Courses(int course_id, String course_name, String course_code) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.course_code = course_code;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }
    
    
}
