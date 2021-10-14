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

    public ResultSet searchByReID(String reID) {
        ResultSet rs = dbconn.getData("select b.sname,a.quantity,a.price from ReservationDetail as a inner join Service as b on a.serID=b.sID where a.reID=" + reID);
        return rs;
    }
}
