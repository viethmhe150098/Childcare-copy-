<%-- 
    Document   : UpdateService
    Created on : Oct 22, 2021, 1:14:06 PM
    Author     : DO THANH TRUNG
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <!-- Basic -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <!-- Site Metas -->
    <title>Update Service</title>
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
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="shortcut icon" href="./img/logo_web.png" type="image/x-icon">
    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css" />
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="./css/service.css">
    
<!--    <link rel="stylesheet" href="./css/register.css">-->
    <!-- [if lt IE 9] -->
</head>

<body style="background: -webkit-linear-gradient(to top, #52a0b8, #8DC26F);
    background: -moz-linear-gradient(to top, #52a0b8, #8DC26F);
    background: -o-linear-gradient(to top, #52a0b8, #8DC26F);
    background: linear-gradient(to top, #52a0b8, #8DC26F);" class="clinic_version">
    <jsp:include page="Header.jsp"/>
    <div id="home" class="parallax first-section wow fadeIn" data-stellar-background-ratio="0.4" style="background-image:url('images/slider-bg.png');">
        <div class="container">
            <div class="row">
                <div class="col-md-12 col-sm-12">
                    <div class="text-contant">
                        <h2>
                            <span class="center"><span class="icon"><img src="images/icon-logo.png" alt="#" /></span></span>
                            <a href="" class="typewrite" data-period="2000" data-type='[ "Welcome to Life Care", "We Care Your Health", "We are Expert!" ]'>
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
    <!-- end section -->

    <!--<div id="editEmployeeModal" class="modal fade">-->
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="updateServiceControl" method="post">
                <div class="modal-header">						
                    <h4 class="modal-title">Update Service <i class="fas fa-user-friends"></i></h4>
                    <!--<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>-->
                </div>
                <div class="modal-body">					
                    <div class="form-group">
                        <label>Service ID</label>
                        <input type="text" name="sid" value="${service.sID}" readonly/>
                    </div>
                    <div class="form-group">
                        <label>Service Name</label>
                        <input name="sname" type="text" value="${service.sname}" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Service Image</label>
                        <input name="image" type="text" value="${service.ser_image}" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Max Quantity</label>
                        <input name="maxquantity" type="text" value="${service.maxquantity}" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Price <i class="far fa-envelope"></i></label>
                        <input name="sprice" type="text" value="${service.sprice}" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label>Description <i class="fas fa-phone"></i>
                        </label>
                        <input name="description" type="text" value="${service.description}" class="form-control" required>
                    </div>                    
                </div>
                <div class="modal-footer" style="margin-top:30px;">
                    <input style="margin-top: 5px" type="submit" class="btn btn-success" value="Update">
                    <!--<input style="background-color: red" type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">-->
                </div>
            </form>
        </div>
    </div>
    <!--</div>-->


    <jsp:include page="Footer.jsp"/>


    <a href="#home" data-scroll class="dmtop global-radius"><i class="fa fa-angle-up"></i></a>
    <!-- all js files -->
    <script>
        function disable() {
            document.getElementById("trangThai").disabled = true;
        }
        function enable() {
            document.getElementById("trangThai").disabled = false;
        }
    </script>
    <script src="js/all.js"></script>
    <!-- all plugins -->
    <script src="js/custom.js"></script>
    <!-- map -->
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCNUPWkb4Cjd7Wxo-T4uoUldFjoiUA1fJc&callback=myMap"></script>

    <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
    <script src="https://unpkg.com/scrollreveal"></script>
    <script src="./js/main.js"></script>
</body>   
</html>