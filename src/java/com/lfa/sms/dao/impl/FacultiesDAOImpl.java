/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.sms.dao.impl;

import com.lfa.sms.dao.FacultiesDAO;
import com.lfa.sms.entity.Faculties;
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
public class FacultiesDAOImpl implements FacultiesDAO {
private DbConnection db=new DbConnection();

    @Override
    public List<Faculties> getAll() throws SQLException, ClassNotFoundException {
        List<Faculties> courseList = new ArrayList<>();
        String sql = "SELECT * FROM ";
        db.connect();
        db.initStatement(sql);
        ResultSet rs = db.query();
        while (rs.next()) {
            Faculties f = new Faculties();
            f.setFac_id(rs.getInt("fac_id"));            
            f.setFac_name(rs.getString("fac_name"));            
            
            courseList.add(f);
        }
        db.close();
        return courseList;}

    @Override
    public int insert(Faculties t) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO courses(course_name,course_code)"
                + "values(?)";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, t.getFac_name());
                int result = db.update();
        db.close();
        return result;
    }

    @Override
    public int update(Faculties t) throws SQLException, ClassNotFoundException {
      String sql = "UPDATE course set name=?,fees=?,status=? "
                + "WHERE id=?";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, t.getFac_id());
        stmt.setString(2, t.getFac_name());
        int result = db.update();
        db.close();
        return result;
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM courses where id=?";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        int result = db.update();
        db.close();
        return result;}

    @Override
    public Faculties getById(int id) throws SQLException, ClassNotFoundException {
        Faculties f = null;
        String sql = "SELECT * FROM courses where id=? ";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = db.query();
        if (rs.next()) {
            f = new Faculties();
            
            f.setFac_id(rs.getInt("fac_id"));            
            f.setFac_name(rs.getString("fac_name"));
        }
        db.close();
        return f;
    }
    
}
