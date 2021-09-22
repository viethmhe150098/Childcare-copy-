<%-- 
    Document   : Login.jsp
    Created on : Sep 22, 2021, 2:50:02 PM
    Author     : Viet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login Form</h1>
        <form action="login" method="POST">
            Username<input type="text" name="adUser" value="" />
            Password<input type="password" name="adPass" value="" />
            <input type="submit" value="" />
        </form>
    </body>
</html>
