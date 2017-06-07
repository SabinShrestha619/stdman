/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.sms.dao.impl;

import com.lfa.sms.dao.StudentsFacultyDAO;
import com.lfa.sms.entity.StudentsFaculty;
import com.lfa.sms.util.DbConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sapu
 */
public class StudentsFacultyDAOImpl implements StudentsFacultyDAO {
private DbConnection db=new DbConnection();

    @Override
    public List<StudentsFaculty> getAll() throws SQLException, ClassNotFoundException {
        List<StudentsFaculty> stdFacultyList = new ArrayList<>();
        String sql = "SELECT * FROM ";
        db.connect();
        db.initStatement(sql);
        ResultSet rs = db.query();
        while (rs.next()) {
            StudentsFaculty sf = new StudentsFaculty();
            sf.setFac_id(rs.getInt("fac_id"));            
            sf.setStd_id(rs.getInt("std_id"));            
            sf.setStdfac_id(rs.getInt("stdfac_id"));
            sf.setJoin_date(rs.getDate("join_date"));
            stdFacultyList.add(sf);
        }
        db.close();
        return stdFacultyList;}

    @Override
    public int insert(StudentsFaculty t) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO stdFacultys(stdFaculty_name,stdFaculty_code)"
                + "values(?,?)";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        
        int result = db.update();
        db.close();
        return result;
    }

    @Override
    public int update(StudentsFaculty t) throws SQLException, ClassNotFoundException {
      String sql = "UPDATE stdFaculty set name=?,fees=?,status=? "
                + "WHERE id=?";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, t.getFac_id());
        stmt.setInt(2, t.getStd_id());
        stmt.setInt(3, t.getStd_id());
        stmt.setDate(4, (Date) t.getJoin_date());
        int result = db.update();
        db.close();
        return result;
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM stdFacultys where id=?";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        int result = db.update();
        db.close();
        return result;}

    @Override
    public StudentsFaculty getById(int id) throws SQLException, ClassNotFoundException {
        StudentsFaculty sf = null;
        String sql = "SELECT * FROM stdFacultys where id=? ";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = db.query();
        if (rs.next()) {
            sf = new StudentsFaculty();
            sf.setFac_id(rs.getInt("fac_id"));            
            sf.setStd_id(rs.getInt("std_id"));            
            sf.setStdfac_id(rs.getInt("stdfac_id"));
            sf.setJoin_date(rs.getDate("join_date"));        }
        db.close();
        return sf;}
    
}
