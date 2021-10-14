/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Blog;
import Entity.Customer;
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
 * @author win
 */
public class DAOBlog {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    DBConnect dbconn = null;

    public DAOBlog(DBConnect dbconn) {
        conn = dbconn.con;
        this.dbconn = dbconn;
    }

    public List<Blog> getListBlog() {
        List<Blog> blogs = new ArrayList<>();
        try {
            String sql = "Select * from blog";

            try {
                conn = new DBConnect().getConnection();//mo ket noi voi sql
            } catch (Exception ex) {
                Logger.getLogger(DAOBlog.class.getName()).log(Level.SEVERE, null, ex);
            }
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                blogs.add(new Blog(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return blogs;
    }

}
