<%-- 
    Document   : Register
    Created on : Sep 25, 2021, 10:12:58 AM
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
        <h2 class="title">Register New Account</h2>
        <form action="register" method="POST">
            <p class="text-danger">${mess}</p>
            First Name: <input type="text" name="fname" ><br>
            Last Name: <input type="text" name="lname" ><br>
            Username: <input type="text" name="username" ><br>
            Password: <input type="password" minlength="8" name="password" ><br>
            Confirm Password: <input type="password" minlength="8" name="confirm"><br>
            <div>
                <label class="label">Gender</label>
                <div class="p-t-10">
                    <label class="radio-container m-r-45">Male
                        <input type="radio" name="gender" value="1">
                        <span class="checkmark"></span>
                    </label>
                    <label class="radio-container">Female
                        <input type="radio" name="gender" value="0">
                        <span class="checkmark"></span>
                    </label>
                </div>
            </div>
            <!--Gender: <input type="text" name="gender"><br>-->
            Email: <input type="email" name="email"><br>
            Phone: <input type="text" name="phonenumber" ><br>
            Age: <input type="text" name="age" ><br>
            Status: <input type="text" name="status" ><br>
            Address: <input type="text" name="address"><br><br>
            <input style="padding: 10px" type="submit" value="Save">

        </form>
    </body>
</html>
