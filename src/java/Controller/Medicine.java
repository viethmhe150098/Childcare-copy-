/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOMedicine;
import Entity.Medicines;
import Model.DBConnect;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Viet
 */
@MultipartConfig
@WebServlet(name = "Medicine", urlPatterns = {"/Medicine"})
public class Medicine extends HttpServlet {

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
        DBConnect dbconn = new DBConnect();
        DAOMedicine dao = new DAOMedicine(dbconn);
        String service = request.getParameter("service");
        if (service == null) {
            ArrayList<Medicines> list = dao.displayMe();
            request.setAttribute("list", list);
            request.getRequestDispatcher("displayMedicine.jsp").forward(request, response);
        }

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

        DBConnect dbconn = new DBConnect();
        DAOMedicine dao = new DAOMedicine(dbconn);
        String service = request.getParameter("service");
        if (service.equals("add")) {

            String meName = request.getParameter("name");
            int meQuantity = Integer.parseInt(request.getParameter("quan"));
            double mePrice = Double.parseDouble(request.getParameter("price"));
            String meDes = request.getParameter("des");
            String img = request.getParameter("img");
            DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(fileItemFactory);
            String fileImg="";
            try {
                List<FileItem> fileItems = upload.parseRequest(request);
                for (FileItem fileItem : fileItems) {
                    if (!fileItem.isFormField()) {
                        // xử lý file
                        String nameimg = fileItem.getName();
                        if (!nameimg.equals("")) {
                            String dirUrl = request.getServletContext()
                                    .getRealPath("") + File.separator + "files";
                            File dir = new File(dirUrl);
                            if (!dir.exists()) {
                                dir.mkdir();
                            }
                            fileImg = dirUrl + File.separator + nameimg;
                            File file = new File(fileImg);
                            try {
                                fileItem.write(file);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            } catch (FileUploadException e) {
                e.printStackTrace();
            }
            Medicines me = new Medicines(meName, meQuantity,fileImg , meDes, mePrice);
            dao.Add(me);
            response.sendRedirect("Medicine");
        }
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
