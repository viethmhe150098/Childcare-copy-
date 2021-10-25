/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Manager;

import DAO.DAOCustomer;
import DAO.DAOPost;
import DAO.DAOReservation;
import DAO.DAOReservationDetail;
import Entity.Reservation;
import Model.DBConnect;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Viet
 */
public class ManagerController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            DBConnect dbconn = new DBConnect();
            String service = request.getParameter("service");
            DAOReservation daoRe = new DAOReservation(dbconn);
            DAOReservationDetail daoDe = new DAOReservationDetail(dbconn);
            DAOCustomer daoCu = new DAOCustomer(dbconn);
            DAOPost daoP = new DAOPost(dbconn);
            if (service == null) {
                int totalRe = daoRe.getTotalRe();
                request.setAttribute("totalRe", totalRe);
                double income = daoRe.getIncome();
                request.setAttribute("income", income);
                int totalCu = daoCu.getTotalCus();
                request.setAttribute("totalCu", totalCu);
                ArrayList<Reservation> list = daoRe.getSubmitted();
                request.setAttribute("list", list);
                request.getRequestDispatcher("ManagerHomePage.jsp").forward(request, response);
            }
            if (service.equals("post")) {
                String indexPage = request.getParameter("index");
                if (indexPage == null) {
                    indexPage = "1";
                }
                int index = Integer.parseInt(indexPage);
                int count = daoP.getTotalPost();
                int endPage = count / 3;
                if (count % 3 != 0) {
                    endPage++;
                }
                request.setAttribute("endP", endPage);
                request.setAttribute("tag", index);

                String sql = "select title,Convert(varchar(10),date_create,103) as 'DD/MM/YYYY', updata_date, a.image, a.status, PCateName, first_name, last_name, a.pID,a.content\n"
                        + "from Post as a join PostCategory as b on a.pCateID=b.pCateID\n"
                        + "join Manager as c on a.author=c.mID\n"
                        + "order by updata_date\n"
                        + "offset " + (index - 1) * 3 + " rows fetch next 3 rows only";
                ResultSet rs1 = dbconn.getData(sql);
                request.setAttribute("ketQua1", rs1);
                request.getRequestDispatcher("Post.jsp").forward(request, response);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
