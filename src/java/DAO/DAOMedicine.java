/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Medicines;
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
 * @author Viet
 */
public class DAOMedicine {

    Connection conn = null;
    DBConnect dbconn = null;

    public DAOMedicine(DBConnect dbconn) {
        conn = dbconn.con;
        this.dbconn = dbconn;
    }
    
    public void Add(Medicines me){
        String sql = "insert into medicine(meName, meQuantity, meImg, meDes, mePrice) values (N'?',?,?,N'?',?)";
        try {
            conn = dbconn.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, me.getMeName());
            ps.setInt(2, me.getMeQuantity());
            ps.setString(3, me.getMeImg());
            ps.setString(4, me.getMeDes());
            ps.setFloat(5, me.getMePrice());
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(DAOMedicine.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public ArrayList<Medicines> displayMe(){
        ArrayList<Medicines> list = new ArrayList<>();
        ResultSet rs = dbconn.getData("select * from Medicine");
        try {
            while (rs.next()) {
                list.add(new Medicines(rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getFloat(6)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOMedicine.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public static void main(String[] args) {
        DBConnect dbconn = new DBConnect();
        DAOMedicine d = new DAOMedicine(dbconn);
        ArrayList<Medicines> list = d.displayMe();
        for (Medicines me: list) {
            System.out.println(me);
        }
    }
}
