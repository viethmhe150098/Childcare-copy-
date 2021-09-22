/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOCustomer;
import DAO.DAOauth;
import Model.DBConnect;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DO THANH TRUNG
 */
public class login extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet login</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
//        processRequest(request, response);
        request.getRequestDispatcher("Login.jsp").forward(request, response);

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
//        processRequest(request, response);
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        DBConnect dbconn = new DBConnect();

        DAOauth auth = new DAOauth();
        if (auth.AdAuth(username, "[a-zA-Z][a-zA-Z0-9]+@[a]")) {
            //true admin
        } else if (auth.AdAuth(username, "[a-zA-Z][a-zA-Z0-9]+@[m]")) {

        } else if (auth.AdAuth(username, "[a-zA-Z][a-zA-Z0-9]+@[s]")) {

        } else {
            //user
            DAOCustomer daocus = new DAOCustomer(dbconn);
            if (daocus.login2(username, password) != null) {
                response.sendRedirect("Susscess.jsp");

            } else {
                response.sendRedirect("Login.jsp");
            }
        }

        //HttpSession session = request.getSession();
        //daocus.login(username, password);
//        ArrayList<Customer> arr = daocus.getAllCustomer();
//        for (Customer cus : arr) {
//            if (cus.getUsername().equalsIgnoreCase(username)) {
//                if (cus.getPassword().equals(password)) {
//                    session.setAttribute("username", username);
//                    //dispatch(request, response, "/Success.jsp");
//                    response.sendRedirect("Susscess.jsp");
//                } else {
//                    request.setAttribute("alert", "Wrong Password!");
//                    dispatch(request, response, "/Login.jsp");
//                    //response.sendRedirect("Login.jsp");
//                }
//            }
////                        response.sendRedirect("Login.jsp");
//            dispatch(request, response, "/Login.jsp");
        //} 
    }

//    private void dispatch(HttpServletRequest request, HttpServletResponse response, String URL) {
//        RequestDispatcher dis = request.getRequestDispatcher(URL);
//        try {
//            dis.forward(request, response);
//        } catch (ServletException ex) {
//            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
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
