<%-- 
    Document   : Login
    Created on : Sep 22, 2021, 10:35:29 AM
    Author     : DO THANH TRUNG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login form</h1>
        <form action="login" method="post">
            username: <input type="text" name="username"/><br>
            password: <input type="text" name="password "/><br>
            <input type="submit" value="login"/>
        </form>
    </body>
</html>
