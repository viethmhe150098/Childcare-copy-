/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Post;
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
public class DAOPost {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    DBConnect dbconn = null;

    public DAOPost(DBConnect dbconn) {
        conn = dbconn.con;
        this.dbconn = dbconn;
    }

    public DAOPost() {
    }

    public List<Post> getListPost() {
        List<Post> Post = new ArrayList<>();
        try {
            String sql = "Select * from Post";

            try {
                conn = new DBConnect().getConnection();//mo ket noi voi sql
            } catch (Exception ex) {
                Logger.getLogger(DAOPost.class.getName()).log(Level.SEVERE, null, ex);
            }
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Post.add(new Post(rs.getString(1), rs.getInt(2), rs.getDate(3),
                        rs.getDate(4), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getString(5)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Post;
    }

    public Post getPostBypID(String pID) {
        String sql = "select * from Post where pID = ?";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, pID);
            rs = ps.executeQuery();

            while (rs.next()) {
                Post post = new Post(rs.getString(1), rs.getInt(2), rs.getDate(3),
                        rs.getDate(4), rs.getString(5), rs.getInt(6), rs.getInt(7),
                        rs.getString(8));
                return post;
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DAOPost.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DAOPost.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void updatePost(String title, String dateupdate, String image,
            String status, int pCateID, int pID) {
        try {
            String sql = "update Post set title=?, updata_date=?, image=?, status=?, pCateID=? where pID=?";
            conn = new DBConnect().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(sql);
            ps.setString(1, title);
            ps.setString(2, dateupdate);
            ps.setString(3, image);
            ps.setString(4, status);
            ps.setInt(5, pCateID);
            ps.setInt(6, pID);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(DAOPost.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getTotalPost() {
        String sql = "select count(*) from Post";
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

    public static void main(String[] args) {
        DAOPost dao = new DAOPost();
        System.out.println(dao.getTotalPost());;
    }
}
