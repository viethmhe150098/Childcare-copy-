/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.SerCate;
import Entity.Service;
import Model.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DO THANH TRUNG
 */
public class DAOService {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    DBConnect dbconn = null;
    
    /*
    Hiển thị các dịch vụ được phân trang (sắp xếp theo ngày cập nhật, được đánh số trang) + trình duyệt với hộp tìm kiếm dịch vụ, các loại dịch vụ, liên hệ / liên kết tĩnh;
- Thông tin dịch vụ được hiển thị bao gồm hình thu nhỏ, tiêu đề, thông tin ngắn gọn, giá gốc và giá ưu đãi;
- Người dùng được chuyển hướng đến thông tin chi tiết của dịch vụ khi họ nhấp vào dịch vụ
- Người dùng có thể chọn thêm dịch vụ vào giỏ hàng hoặc phản hồi về dịch vụ bằng cách nhấp vào nút Mua & Phản hồi của dịch vụ một cách phản hồi
    */
    
    public List<Service> getAllProduct() {
        List<Service> list = new ArrayList<>();
        String query = "select * from Service";
        try {
            conn = new DBConnect().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Service(rs.getString(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Service> getProductByCID(String cid) {
        List<Service> list = new ArrayList<>();
        String query = "select * from Service\n"
                + "where scID = ?";
        try {
            conn = new DBConnect().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Service(rs.getString(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Service> searchByName(String txtSearch) {
        List<Service> list = new ArrayList<>();
        String query = "select * from Service\n"
                + "where [sname] like ?";
        try {
            conn = new DBConnect().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                 list.add(new Service(rs.getString(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Service> pagingProduct(int index) {
        List<Service> list = new ArrayList<>();
        String sql = "select * from Service\n"
                + "order by sID\n"
                + "offset ? rows fetch next 3 rows only";
        try {
            conn = new DBConnect().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, (index - 1) * 3);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Service(rs.getString(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),rs.getString(7)));
            }

        } catch (Exception e) {

        }
        return list;
    }
    public List<SerCate> getAllCateSer() {
        List<SerCate> list = new ArrayList<>();
        String query = "select * from SerCate";
        try {
            conn = new DBConnect().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new SerCate(rs.getString(1),rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }
     public static void main(String[] args) {
          DAOService dao = new DAOService();
           List<Service> list = dao.getAllProduct();
           List<Service> list1 = dao.searchByName("ducmanh");
           List<SerCate> listC = dao.getAllCateSer();
           for(SerCate o : listC ){
               System.out.println(o);
           }
     }
}
