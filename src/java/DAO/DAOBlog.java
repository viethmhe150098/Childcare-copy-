/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Blog;
import Model.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

        } catch (Exception e) {
        }
        return blogs;
    }

}
