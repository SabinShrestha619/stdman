/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.sms.dao.impl;

import com.lfa.sms.dao.SemesterDAO;
import com.lfa.sms.entity.Semester;
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
public class SemesterDAOImpl implements SemesterDAO {

    private DbConnection db = new DbConnection();

    @Override
    public List<Semester> getAll() throws SQLException, ClassNotFoundException {
        List<Semester> semesterList = new ArrayList<>();
        String sql = "SELECT * FROM ";
        db.connect();
        db.initStatement(sql);
        ResultSet rs = db.query();
        while (rs.next()) {
            Semester se = new Semester();
            se.setSem_id(rs.getInt("sem_id"));
            se.setSem_name(rs.getString("sem_name"));

            semesterList.add(se);
        }
        db.close();
        return semesterList;
    }

    @Override
    public int insert(Semester t) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO semesters(semester_name,semester_code)"
                + "values(?,?)";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setString(1, t.getSem_name());
        int result = db.update();
        db.close();
        return result;
    }

    @Override
    public int update(Semester t) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE semester set name=?,fees=?,status=? "
                + "WHERE id=?";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, t.getSem_id());
        stmt.setString(1, t.getSem_name());
        int result = db.update();
        db.close();
        return result;
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM semesters where id=?";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        int result = db.update();
        db.close();
        return result;
    }

    @Override
    public Semester getById(int id) throws SQLException, ClassNotFoundException {
        Semester se = null;
        String sql = "SELECT * FROM semesters where id=? ";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = db.query();
        if (rs.next()) {
            se = new Semester();
            se.setSem_id(rs.getInt("sem_id"));
            se.setSem_name(rs.getString("sem_name"));

        }
        db.close();
        return se;
    }

}
