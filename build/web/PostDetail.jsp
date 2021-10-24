<%-- 
    Document   : PostDetail
    Created on : Oct 18, 2021, 9:23:04 PM
    Author     : DO THANH TRUNG
--%>

<%@page import="java.sql.ResultSet"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- Mobile Metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="viewport" content="initial-scale=1, maximum-scale=1">
        <!-- Site Metas -->
        <title>Post Detail</title>
        <meta name="keywords" content="">
        <meta name="description" content="">
        <meta name="author" content="">
        <!-- Site Icons -->
        <link rel="shortcut icon" href="images/fevicon.ico.png" type="image/x-icon" />
        <link rel="apple-touch-icon" href="images/apple-touch-icon.png">
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- Site CSS -->
        <link rel="stylesheet" href="style.css">
        <!-- Colors CSS -->
        <link rel="stylesheet" href="css/colors.css">
        <!-- ALL VERSION CSS -->
        <link rel="stylesheet" href="css/versions.css">
        <!-- Responsive CSS -->
        <link rel="stylesheet" href="css/responsive.css">
        <!-- Custom CSS -->
        <link rel="stylesheet" href="css/custom.css">
        <!-- Modernizer for Portfolio -->
        <script src="js/modernizer.js"></script>
        <!-- [if lt IE 9] -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">        
    </head>

    <body class="clinic_version">

        <jsp:include page="Header.jsp"/>
        <div id="home" class="parallax first-section wow fadeIn" data-stellar-background-ratio="0.4"
             style="background-image:url('images/slider-bg.png');">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 col-sm-12">
                        <div class="text-contant">
                            <h2>
                                <span class="center"><span class="icon"><img src="images/icon-logo.png"
                                                                             alt="#" /></span></span>
                                <a href="" class="typewrite" data-period="2000"
                                   data-type='[ "Welcome to Life Care", "We Care Your Health", "We are Expert!" ]'>
                                    <span class="wrap"></span>
                                </a>
                            </h2>
                        </div>
                    </div>
                </div>
                <!-- end row -->
            </div>
            <!-- end container -->
        </div>
        <div class="contain">

            <div class="reservation">
                <%ResultSet rs4 = (ResultSet) request.getAttribute("postDetail");%>
                <%while (rs4.next()) {%>

                <div class="content">
                    <h1>${rs4.pCateName}</h1>
                    <div class="container1">
                        <h2>${rs4.title}</h2>
                        <div class="product">
                            <div class="product-image">
                                <img src="images/${rs4.image}" alt="post detail">
                            </div>
                            <div class="product-info">
                                <p><span>Date Create</span>${rs4.date_create}</p>
                                <p><span>Author</span>${rs4.first_name} ${rs4.last_name}</p>
                                <p><span>Status</span>${rs4.status==1?"Active":"Inactive"}</p>
                                <p><span>Description</span>Post detail with abcdefg</p>
                                <!--<p><span>Description</span>Post detail with abcdefg</p>-->
                            </div>
                            <div class="clear"></div>
                            <div>
                                <a href="updatePostControl?pID=${rs4.pID}" style="color:#fff" class="edit">Update</a>
                            </div>
                        </div>
                    </div>
                </div>

                <%}%>
            </div>
        </div>

        <jsp:include page="Footer.jsp"/>
        <a href="#home" data-scroll class="dmtop global-radius"><i class="fa fa-angle-up"></i></a>
        <!-- all js files -->
        <script src="js/all.js"></script>
        <!-- all plugins -->
        <script src="js/custom.js"></script>
        <!-- map -->
        <script
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCNUPWkb4Cjd7Wxo-T4uoUldFjoiUA1fJc&callback=myMap"></script>
    </body>

</html>


