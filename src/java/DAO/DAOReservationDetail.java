/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Reservation;
import Entity.ReservationDetail;
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
public class DAOReservationDetail {

    Connection conn = null;
    DBConnect dbconn = null;

    public DAOReservationDetail(DBConnect dbconn) {
        conn = dbconn.con;
        this.dbconn = dbconn;
    }
    public ArrayList<ReservationDetail> searchByReID(String reID){
        ArrayList<ReservationDetail> list = new ArrayList<>();
        String sql = "select * from ReservationDetail where reID="+reID;
        try {
            PreparedStatement pr = conn.prepareStatement(sql);
            ResultSet rs = pr.executeQuery();
            while(rs.next()){
                list.add( new ReservationDetail(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getFloat(4)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
