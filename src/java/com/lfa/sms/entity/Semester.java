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
public class Semester {
    private int sem_id;
    private String sem_name;

    public Semester() {
    }

    public Semester(int sem_id, String sem_name) {
        this.sem_id = sem_id;
        this.sem_name = sem_name;
    }

    public int getSem_id() {
        return sem_id;
    }

    public void setSem_id(int sem_id) {
        this.sem_id = sem_id;
    }

    public String getSem_name() {
        return sem_name;
    }

    public void setSem_name(String sem_name) {
        this.sem_name = sem_name;
    }
    
    
}
