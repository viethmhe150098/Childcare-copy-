/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Customer;
import Model.DBConnect;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DO THANH TRUNG
 */
public class DAOCustomer {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    DBConnect dbconn = null;

    public DAOCustomer(DBConnect dbconn) {
        conn = dbconn.con;
        this.dbconn = dbconn;
    }
    
    public Customer login2(String user, String pass) {
        ResultSet rs = dbconn.getData("select * from Customer where username='" + user + "' and password='" + pass + "'");
        try {
            while (rs.next()) {
                return new Customer(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7),
                         rs.getString(8), rs.getInt(9), rs.getInt(10), rs.getString(11));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Customer login(String username, String password) {
        try {
            String sql = "select * from Customer where username = ? and password = ?";
            //ResultSet rs = dbconn.getData(sql);
            //PreparedStatement statement = conn.prepareStatement(sql);
            ps=conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            //ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Customer cus = new Customer(rs.getString(1), rs.getString(2));
                return cus;
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean login1(String username, String password) {
        boolean isLogin = false;
        String sql = "select * from Customer where username = ? and password = ?";
        try {
            //ResultSet rs = dbconn.getData(sql);
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();
            isLogin = rs.next();
            if (isLogin) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isLogin;
    }

    public ArrayList<Customer> getAllCustomer() {
        ArrayList<Customer> arr = new ArrayList<Customer>();
        String sql = "select * from Customer";
        ResultSet rs = dbconn.getData(sql);
        try {
            while (rs.next()) {
                Customer cus = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7),
                         rs.getString(8), rs.getInt(9), rs.getInt(10), rs.getString(11));
                arr.add(cus);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }

    public static void main(String[] args) {
        DBConnect dbconn = new DBConnect();
        DAOCustomer dao = new DAOCustomer(dbconn);
        if (dao.login2("viet", "1234567") != null) {
            System.out.println("ok");
        } else {
            System.out.println("not ok");
        }
        //trung
//        System.out.println(dao.login("trung","123456"));
    }
}
