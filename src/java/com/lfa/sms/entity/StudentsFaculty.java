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
public class StudentsFaculty {
    private int stdfac_id,fac_id,std_id;
    private Date join_date;

    public StudentsFaculty() {
    }

    public StudentsFaculty(int stdfac_id, int fac_id, int std_id) {
        this.stdfac_id = stdfac_id;
        this.fac_id = fac_id;
        this.std_id = std_id;
    }

    public int getStdfac_id() {
        return stdfac_id;
    }

    public void setStdfac_id(int stdfac_id) {
        this.stdfac_id = stdfac_id;
    }

    public int getFac_id() {
        return fac_id;
    }

    public void setFac_id(int fac_id) {
        this.fac_id = fac_id;
    }

    public int getStd_id() {
        return std_id;
    }

    public void setStd_id(int std_id) {
        this.std_id = std_id;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

       
    
}
