/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.sms.dao.impl;

import com.lfa.sms.dao.CoursesDAO;
import com.lfa.sms.entity.Courses;
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
public class CoursesDAOImpl implements CoursesDAO {

    private DbConnection db = new DbConnection();

    @Override
    public List<Courses> getAll() throws SQLException, ClassNotFoundException {
        List<Courses> courseList = new ArrayList<>();
        String sql = "SELECT * FROM courses ";
        db.connect();
        db.initStatement(sql);
        ResultSet rs = db.query();
        while (rs.next()) {
            Courses c = new Courses();
            c.setCourse_id(rs.getInt("course_id"));
            c.setCourse_name(rs.getString("course_name"));
            c.setCourse_code(rs.getString("course_code"));
            courseList.add(c);
        }
        db.close();
        return courseList;
    }

    @Override
    public int insert(Courses t) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO courses(course_name,course_code)"
                + "values(?,?)";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, t.getCourse_name());
        stmt.setString(2, t.getCourse_code());
        int result = db.update();
        db.close();
        return result;
    }

    @Override
    public int update(Courses t) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE courses set course_name,course_code=? "
                + "WHERE course_id=?";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, t.getCourse_id());
        stmt.setString(2, t.getCourse_name());
        stmt.setString(3, t.getCourse_code());
        int result = db.update();
        db.close();
        return result;
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM courses where courses_id=?";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        int result = db.update();
        db.close();
        return result;
    }

    @Override
    public Courses getById(int id) throws SQLException, ClassNotFoundException {
        Courses c = null;
        String sql = "SELECT * FROM courses where courses_id=? ";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = db.query();
        if (rs.next()) {
            c = new Courses();
            c.setCourse_id(rs.getInt("course_id"));
            c.setCourse_name(rs.getString("course_name"));
            c.setCourse_code(rs.getString("course_code"));
        }
        db.close();
        return c;
    }

    @Override
    public List<Courses> search(Courses Name) throws SQLException, ClassNotFoundException {
        List<Courses> courseList = new ArrayList<>();
        String sql = "SELECT * FROM students "
                + "or course_name like '%" + Name + "%'"
                + "or course_code like '%" + Name + "%'";
        db.connect();
        db.initStatement(sql);
        ResultSet rs = db.query();
        while (rs.next()) {
            Courses c = new Courses();
            c.setCourse_id(rs.getInt("course_id"));
            c.setCourse_name(rs.getString("course_name"));
            c.setCourse_code(rs.getString("course_code"));
            courseList.add(c);
        }
        db.close();
        return courseList;
       
    }

}
