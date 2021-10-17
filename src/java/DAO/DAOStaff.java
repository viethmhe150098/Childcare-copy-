/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Staff;
import Model.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DO THANH TRUNG
 */
public class DAOStaff {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    DBConnect dbconn = null;

    public DAOStaff(DBConnect dbconn) {
        conn = dbconn.con;
        this.dbconn = dbconn;
    }
     public DAOStaff() {
    }


    public Staff loginStaff(String username, String password) {
        try {
            String sql = "select * from Staff where username = ? and password = ?";

            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();

            while (rs.next()) {
                Staff sta = new Staff(rs.getString(1), rs.getInt(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getInt(8), rs.getInt(9));
                return sta;
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAOStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     public int getTotalStaff() {
        String sql = "select count(*) from Staff";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {

        }
        return 0;
    }
     public List<Staff> pagingStaff(int index) {
        List<Staff> list = new ArrayList<>();
        String sql = "select * from Staff\n"
                + "order by sID\n"
                + "offset ? rows fetch next 3 rows only";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, (index - 1) * 3);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Staff(rs.getString(1), rs.getInt(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getInt(8), rs.getInt(9)));
            }

        } catch (Exception e) {

        }
        return list;
    }


    public ArrayList<Staff> getAllStaff() {
        ArrayList<Staff> arr = new ArrayList<Staff>();
        String sql = "select * from Staff";
        ResultSet rs = dbconn.getData(sql);
        try {
            while (rs.next()) {
                Staff sta = new Staff(rs.getString(1), rs.getInt(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getInt(8), rs.getInt(9));
                arr.add(sta);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
      public List<Staff> getAllStaff1() {
        List<Staff> list = new ArrayList<>();
        String query = "select * from Staff";
        try {
            conn = new DBConnect().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Staff(rs.getString(1), rs.getInt(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getInt(8), rs.getInt(9)));
            }
        } catch (Exception e) {
        }
        return list;
     }

    public static void main(String[] args) {
        DBConnect dbconn = new DBConnect();
        DAOStaff dao = new DAOStaff(dbconn);
        List<Staff> list = dao.getAllStaff1();
        for (Object o : list) {
            System.out.println(o);
        }
//
//        if(dao.loginStaff("huy@s", "123456")==null){
//            System.out.println("not ok");
//        }else{
//            System.out.println("ok");
//        }

//        System.out.println(dao.loginStaff("huy@s", "12345678"));
        
    }
}
