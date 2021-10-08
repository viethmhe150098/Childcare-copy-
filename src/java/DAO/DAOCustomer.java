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
import java.util.List;
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
    
    
    public DAOCustomer() {
    }

    public Customer loginCustomer(String username, String password) {
        try {
            String sql = "select * from Customer where username = ? and password = ?";

            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();

            while (rs.next()) {
//                Customer cus = new Customer(rs.getString(1), rs.getString(2));
                Customer cus = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), 
                        rs.getString(7), rs.getString(8), rs.getString(9),
                        rs.getString(10), rs.getString(11));
                return cus;
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     public List<Customer> getAllCustomer1() {
        List<Customer> list = new ArrayList<>();
        String query = "select * from Customer";
        try {
            conn = new DBConnect().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11),rs.getInt(12)));
            }
        } catch (Exception e) {
        }
        return list;
     }
     public Customer getCustomerByID(String cid) {
        List<Customer> list = new ArrayList<>();
        String query = "select * from Customer where cID=?";
        try {
            conn = new DBConnect().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
              ps.setString(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Customer(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11),rs.getInt(12));
            }
        } catch (Exception e) {
        }
        return null;
     }
    public Customer CheckExistCustomer(String username) {
        try {
            String sql = "select * from Customer where username = ?";

            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();

            while (rs.next()) {
                Customer cus = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), 
                        rs.getString(7), rs.getString(8), rs.getString(9),
                        rs.getString(10), rs.getString(11));
                return cus;
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Customer> getAllCustomer() {
        ArrayList<Customer> arr = new ArrayList<Customer>();
        String sql = "select * from Customer";
        ResultSet rs = dbconn.getData(sql);
        try {
            while (rs.next()) {
                Customer cus = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),
                        rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));
                arr.add(cus);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
   public Customer getPass(String username) {
        try {
            String sql = "select password from Customer where username = ?";

            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
           
            rs = ps.executeQuery();

            while (rs.next()) {
//                Customer cus = new Customer(rs.getString(1), rs.getString(2));
                Customer cus = new Customer( rs.getString(1));
                return cus;
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public int insertCus(Customer cus) {
        int n = 0;
        try {
            String sql = "insert into Customer(first_name, last_name, gender, "
                    + "email, tel, username,password,age,address)\n"
                    + "values(?, ?, ?, ?, ?, ?, ?, ?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cus.getFirst_name());
            ps.setString(2, cus.getLast_name());
            ps.setString(3, cus.getGender());
            ps.setString(4, cus.getEmail());
            ps.setString(5, cus.getTel());
            ps.setString(6, cus.getUsername());
            ps.setString(7, cus.getPassword());
            ps.setString(8, cus.getAge());
            
            ps.setString(9, cus.getAddress());
            n = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }

    public static void main(String[] args) {
        DBConnect dbconn = new DBConnect();
        DAOCustomer dao = new DAOCustomer(dbconn);
       Customer a = dao.getCustomerByID("1");
        System.out.println(a);
        List<Customer> list = dao.getAllCustomer1();
        for(Customer o : list){
            System.out.println(o);
        }
//        }
        
//        System.out.println(dao.loginCustomer("trung", "12345678"));
        
//        dao.insertCus(new Customer("gia", "phu", "1", "phu@gmail.com", "086342623", "phu", "12345678", "20", "1", "ha noi"));
    }
}

