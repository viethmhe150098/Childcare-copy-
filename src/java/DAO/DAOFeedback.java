/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Feedback;
import Model.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class DAOFeedback {
      Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    DBConnect dbconn = null;
     public List<Feedback> pagingProduct(int index) {
        List<Feedback> list = new ArrayList<>();
        String sql = "select * from feedback\n"
                + "order by fID\n"
                + "offset ? rows fetch next 3 rows only";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, (index - 1) * 3);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Feedback(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6), rs.getString(7),rs.getString(8),rs.getInt(9)));
            }

        } catch (Exception e) {

        }
        return list;
    }
      public static void main(String[] args) {
          DAOFeedback  dao = new DAOFeedback();
          List<Feedback> list = dao.pagingProduct(1);
          for(Feedback o : list){
              System.out.println(o);
          }
      }
}
