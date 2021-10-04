<%-- 
    Document   : Userprofile
    Created on : Oct 3, 2021, 2:25:48 PM
    Author     : LOVE
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Entity.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>YOUR PROFILE</h1>
          <% ArrayList<Customer> ct= (ArrayList<Customer>)request.getAttribute("cs");
        %>
        
            <table >
                <thead>
                    <tr>
                    
                        <th>Your Name</th>
                        <th>Your Gender</th>
                        <th>Your Email</th>
                        <th>Your Phone</th>
                        <th>Your Age</th>
                        <th>Your Address</th>
                        
                    </tr>
                </thead>
                <tbody>
                   <% for(Customer c: ct){ %>
                    <tr>
                        <td><%=c.getUsername()%></td>
                        <td><%=c.getGender()%></td>
                        <td><%=c.getEmail()%></td>
                        <td><%=c.getTel()%></td>
                        <td><%=c.getAge()%></td>
                        <td><%=c.getAddress()%></td>
                        <td><a href = "CustomerControl?id=<%=c.getcID()%>&type1=change">Change password</a></td>
                    </tr>
                    <%}%>
    </body>
</html>
