<%-- 
    Document   : enterCode
    Created on : Oct 6, 2021, 9:33:55 PM
    Author     : Viet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Enter Code</title>
</head>

<body>
    <h2>We have sent a confirmation email to <b>${email}</b> please enter the code you received</h2>
    <form method="post" action="confirmAcc">
        <input type="text" placeholder="Example: 123456" style="height:30px;width: 500px;" name="uCode"><br>
        <button type="submit" style="margin: 10px 0px;">Send</button>
    </form>
</body>

</html>
