/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.sms.dao;

import com.lfa.sms.entity.Students;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author sapu
 */
public interface searchDAO {
    
     List<Students> search(String Name) throws SQLException, ClassNotFoundException;
}
