/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Reservation;
import Model.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Viet
 */
public class DAOReservation {

    Connection conn = null;
    DBConnect dbconn = null;
    public DAOReservation(DBConnect dbconn) {
        conn = dbconn.con;
        this.dbconn = dbconn;
    }
    private static final String alpha = "abcdefghijklmnopqrstuvwxyz"; // a-z
    private static final String alphaUpperCase = alpha.toUpperCase(); // A-Z
    private static final String digits = "0123456789"; // 0-9
    private static final String specials = "~=+%^*/()[]{}/!@#$?|";
    private static final String ALPHA_NUMERIC = alpha + alphaUpperCase + digits;
    private static final String ALL = alpha + alphaUpperCase + digits + specials;
    private static Random generator = new Random();

    public String randomAlphaNumeric(int numberOfCharactor) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfCharactor; i++) {
            int number = randomNumber(0, ALPHA_NUMERIC.length() - 1);
            char ch = ALPHA_NUMERIC.charAt(number);
            sb.append(ch);
        }
        return sb.toString();
    }

    public static int randomNumber(int min, int max) {
        return generator.nextInt((max - min) + 1) + min;
    }
    public Reservation searchbyID(String reID){
        String sql = "select * from Reservation where reID="+reID;
        try {
            PreparedStatement pr = conn.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();
            while(rs.next()){
                return new Reservation(rs.getString(1), rs.getString(2), rs.getFloat(3), rs.getString(4), rs.getString(5), 
                        rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getInt(10) , rs.getString(11), rs.getString(12));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int changeStatus(int reID, int status) {
        int n = 0;
        String sql = "update Reservation set status = ? where reID= ?";
        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setInt(1, status);
            pre.setInt(2, reID);
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAOReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
}
