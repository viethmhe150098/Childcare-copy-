<%-- 
    Document   : Verify
    Created on : Sep 26, 2021, 10:30:44 AM
    Author     : DO THANH TRUNG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Verify Page</title>
    </head>
    <body>
        <span>We already send a verification code to your mail</span>
        <form action="verify" method="post">
            <input type="text" name="authcode">
            <input type="submit" name="verify">
        </form>
    </body>
</html>
