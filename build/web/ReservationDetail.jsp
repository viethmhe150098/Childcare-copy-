<%-- 
    Document   : ReservationDetail
    Created on : Oct 10, 2021, 5:41:45 PM
    Author     : DO THANH TRUNG
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <%ResultSet rs1 = (ResultSet) request.getAttribute("reserDetail");%>
        <%while (rs1.next()) {%>
    <tr>
        <td><%=rs1.getString(1)%></td>
        <td><%=rs1.getDate(2)%></td>
        <td><%=rs1.getString(3)%></td>
        <td><%=rs1.getString(4)%></td>
        <td><%=rs1.getString(5)%></td>
        <td><%=rs1.getString(6)%></td>
        <td><%=rs1.getString(7)%></td>
        <td><%=rs1.getString(8)%></td>
        <td><%=rs1.getString(9)%></td>
        <td><%=rs1.getDouble(10)%></td>
        <td><%=rs1.getInt(11)%></td>
        <td><%=rs1.getString(12)%></td>
    </tr>	
    <%}%>
</body>
</html>
