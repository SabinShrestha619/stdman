/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.sms.dao.impl;

import com.lfa.sms.dao.StudentsDAO;
import com.lfa.sms.entity.Students;
import com.lfa.sms.util.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sapu
 */
public class StudentsDAOImpl implements StudentsDAO {

    private DbConnection db = new DbConnection();

    @Override
    public List<Students> getAll() throws SQLException, ClassNotFoundException {
        List<Students> studentList = new ArrayList<>();
        String sql = "SELECT * FROM students";
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
        return studentList;
    }

    @Override
    public int insert(Students t) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO students(std_name,std_address)"
                + "values(?,?)";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, t.getStd_name());
        stmt.setString(2, t.getStd_address());
        int result = db.update();
        db.close();
        return result;
    }

    @Override
    public int update(Students t) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE student set std_name=?,std_address "
                + "WHERE std_id=?";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, t.getStd_id());
        stmt.setString(2, t.getStd_name());
        stmt.setString(3, t.getStd_address());
        int result = db.update();
        db.close();
        return result;
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM students where std_id=?";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        int result = db.update();
        db.close();
        return result;
    }

    @Override
    public Students getById(int id) throws SQLException, ClassNotFoundException {
        Students s = null;
        String sql = "SELECT * FROM students where std_id=? ";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = db.query();
        if (rs.next()) {
            s = new Students();
            s.setStd_id(rs.getInt("std_id"));
            s.setStd_name(rs.getString("std_name"));
            s.setStd_address(rs.getString("std_address"));
        }
        db.close();
        return s;
    }

}
