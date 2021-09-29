/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Manager;
import Model.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DO THANH TRUNG
 */
public class DAOManager {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    DBConnect dbconn = null;

    public DAOManager(DBConnect dbconn) {
        conn = dbconn.con;
        this.dbconn = dbconn;
    }
    
        public Manager loginManager(String username, String password) {
        try {
            String sql = "select * from Manager where username = ? and password = ?";

            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();

            while (rs.next()) {
                Manager mana = new Manager(rs.getInt(1), rs.getString(2), rs.getInt(3),
                        rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7),
                        rs.getString(8), rs.getString(9), rs.getString(10));
                return mana;
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAOManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
        
        public ArrayList<Manager> getAllManager() {
        ArrayList<Manager> arr = new ArrayList<Manager>();
        String sql = "select * from Manager";
        ResultSet rs = dbconn.getData(sql);
        try {
            while (rs.next()) {
                Manager mana = new Manager(rs.getInt(1), rs.getString(2), rs.getInt(3),
                        rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7),
                        rs.getString(8), rs.getString(9), rs.getString(10));
                arr.add(mana);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
        
        public static void main(String[] args) {
        DBConnect dbconn = new DBConnect();
        DAOManager dao = new DAOManager(dbconn);
        ArrayList<Manager> list = dao.getAllManager();
//        for (Object o : list) {
//            System.out.println(o);
//        }
        
//        if(dao.loginManager("thanh", "123456")==null){
//            System.out.println("not ok");
//        }else{
//            System.out.println("ok");
//        }
            System.out.println(dao.loginManager("thanh@m", "12345678"));
    }
}
