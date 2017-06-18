/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.sms.dao.impl;

import com.lfa.sms.dao.searchDAO;
import com.lfa.sms.entity.Students;
import com.lfa.sms.util.DbConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sapu
 */
public class searchDAOImpl implements searchDAO {

    private DbConnection db = new DbConnection();

     @Override
    public List<Students> search(String Name) throws SQLException, ClassNotFoundException {
        List<Students> studentList = new ArrayList<>();
        String sql = "SELECT * FROM students "
                + "where std_name like '%"+Name+"%'"
                + "or std_address like '%"+Name+"%'";
        db.connect();
        db.initStatement(sql);
        ResultSet rs = db.query();
        while (rs.next()) {
            Students s = new Students();
            s.setStd_id(rs.getInt("std_id"));
            s.setStd_name(rs.getString("std_name"));
            s.setStd_address(rs.getString("std_address"));
            studentList.add(s);
        }
        db.close();
        return studentList;}

}
