/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.sms.entity;

import java.util.Date;

/**
 *
 * @author sapu
 */
public class StudentsFacultySemesters {
    private int stdfacsem_id, fac_id, sem_id;
    private Date enroll_date;

    public StudentsFacultySemesters() {
    }

    public StudentsFacultySemesters(int stdfacsem_id, int fac_id, int sem_id) {
        this.stdfacsem_id = stdfacsem_id;
        this.fac_id = fac_id;
        this.sem_id = sem_id;
    }

    public int getStdfacsem_id() {
        return stdfacsem_id;
    }

    public void setStdfacsem_id(int stdfacsem_id) {
        this.stdfacsem_id = stdfacsem_id;
    }

    public int getFac_id() {
        return fac_id;
    }

    public void setFac_id(int fac_id) {
        this.fac_id = fac_id;
    }

    public int getSem_id() {
        return sem_id;
    }

    public void setSem_id(int sem_id) {
        this.sem_id = sem_id;
    }

    public Date getEnroll_date() {
        return enroll_date;
    }

    public void setEnroll_date(Date enroll_date) {
        this.enroll_date = enroll_date;
    }
    
    
    
}
