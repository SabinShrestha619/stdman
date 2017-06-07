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
public class Students {
    private int std_id;
    private String std_name, std_address;

    public Students() {
    }

    public Students(int std_id, String std_name, String std_address) {
        this.std_id = std_id;
        this.std_name = std_name;
        this.std_address = std_address;
    }

    public int getStd_id() {
        return std_id;
    }

    public void setStd_id(int std_id) {
        this.std_id = std_id;
    }

    public String getStd_name() {
        return std_name;
    }

    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }

    public String getStd_address() {
        return std_address;
    }

    public void setStd_address(String std_address) {
        this.std_address = std_address;
    }
    
    
    
}
