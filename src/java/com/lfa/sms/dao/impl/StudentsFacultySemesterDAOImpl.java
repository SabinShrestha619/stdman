/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.sms.dao.impl;

import com.lfa.sms.dao.StudentsFacultySemestersDAO;
import com.lfa.sms.entity.StudentsFacultySemesters;
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
public class StudentsFacultySemesterDAOImpl implements StudentsFacultySemestersDAO {

    private DbConnection db = new DbConnection();

    @Override
    public List<StudentsFacultySemesters> getAll() throws SQLException, ClassNotFoundException {
        List<StudentsFacultySemesters> facsemList = new ArrayList<>();
        String sql = "SELECT * FROM ";
        db.connect();
        db.initStatement(sql);
        ResultSet rs = db.query();
        while (rs.next()) {
            StudentsFacultySemesters sfs = new StudentsFacultySemesters();
            sfs.setFac_id(rs.getInt("fac_id"));
            sfs.setSem_id(rs.getInt("sem_id"));
            sfs.setStdfacsem_id(rs.getInt("stdfacsem_id"));
            sfs.setEnroll_date(rs.getDate("enroll_date"));
            facsemList.add(sfs);
        }
        db.close();
        return facsemList;
    }

    @Override
    public int insert(StudentsFacultySemesters t) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO facsems(facsem_name,facsem_code)"
                + "values(?,?)";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        int result = db.update();
        db.close();
        return result;
    }

    @Override
    public int update(StudentsFacultySemesters t) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE facsem set name=?,fees=?,status=? "
                + "WHERE id=?";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, t.getFac_id());
        stmt.setInt(2, t.getSem_id());
        stmt.setDate(3, (Date) t.getEnroll_date());
         stmt.setInt(4, t.getStdfacsem_id());

        int result = db.update();
        db.close();
        return result;
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM facsems where id=?";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        int result = db.update();
        db.close();
        return result;
    }

    @Override
    public StudentsFacultySemesters getById(int id) throws SQLException, ClassNotFoundException {
        StudentsFacultySemesters sfs = null;
        String sql = "SELECT * FROM facsems where id=? ";
        db.connect();
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = db.query();
        if (rs.next()) {
            sfs = new StudentsFacultySemesters();
            sfs.setFac_id(rs.getInt("fac_id"));
            sfs.setSem_id(rs.getInt("sem_id"));
            sfs.setStdfacsem_id(rs.getInt("stdfacsem_id"));
            sfs.setEnroll_date(rs.getDate("enroll_date"));
        }
        db.close();
        return sfs;
    }

    @Override
    public List<StudentsFacultySemesters> search(StudentsFacultySemesters Name) throws SQLException, ClassNotFoundException {
        List<StudentsFacultySemesters> studentfacultyList = new ArrayList<>();
        String sql = "SELECT * FROM students "
                + "where std_name like '%" + Name + "%'"
                + "or std_address like '%" + Name + "%'";
        db.connect();
        db.initStatement(sql);
        ResultSet rs = db.query();
        while (rs.next()) {
            StudentsFacultySemesters sf = new StudentsFacultySemesters();
            sf.setFac_id(rs.getInt("fac_id"));
            sf.setStd_id(rs.getInt("std_id"));
            sf.setStdfac_id(rs.getInt("stdfac_id"));
            sf.setJoin_date(rs.getDate("join_date"));
            studentfacultyList.add(sf);
        }
        db.close();
        return studentfacultySemesterList;
    }

}
