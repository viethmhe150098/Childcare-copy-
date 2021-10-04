<%-- 
    Document   : Changepass
    Created on : Oct 3, 2021, 4:21:52 PM
    Author     : LOVE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="CustomerControl?type2=done" method="POST">
        <table >
            
            <tbody>
                <tr>
                    <td>Old Password:</td>
                    <td><input type="password" name="old" value="" /></td>
                </tr>
                <tr>
                    <td>New Password:</td>
                    <td><input type="password" name="new" value="" /></td>
                </tr>
                <tr>
                    <td>New Password again:</td>
                    <td><input type="password" name="newa" value="" /></td>
                    
                </tr>
            </tbody>
        </table>
        </form>
    </body>
</html>
