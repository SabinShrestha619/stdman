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
public class Faculties {
    private int fac_id;
    private String fac_name;

    public Faculties() {
    }

    public Faculties(int fac_id, String fac_name) {
        this.fac_id = fac_id;
        this.fac_name = fac_name;
    }

    public int getFac_id() {
        return fac_id;
    }

    public void setFac_id(int fac_id) {
        this.fac_id = fac_id;
    }

    public String getFac_name() {
        return fac_name;
    }

    public void setFac_name(String fac_name) {
        this.fac_name = fac_name;
    }
    
}
