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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Basic -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- Mobile Metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="viewport" content="initial-scale=1, maximum-scale=1">
        <!-- Site Metas -->
        <title>Register Page</title>
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

        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <link rel="shortcut icon" href="./img/logo_web.png" type="image/x-icon">
        <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
        <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css" />
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
        <link rel="stylesheet" href="./css/service.css">
        <!-- [if lt IE 9] -->

        <link rel="stylesheet" href="./css/register.css">

    </head>
    <body>
        <header>
            <div class="header-top wow fadeIn">
                <div class="container">
                    <a class="navbar-brand" href="index.html"><img src="images/logo.png" alt="image"></a>
                    <div class="right-header">
                        <div class="header-info">
                            <div class="info-inner">
                                <span class="icontop"><img src="images/phone-icon.png" alt="#"></span>
                                <span class="iconcont"><a href="tel:800 123 456">800 123 456</a></span>	
                            </div>
                            <div class="info-inner">
                                <span class="icontop"><i class="fa fa-envelope" aria-hidden="true"></i></span>
                                <span class="iconcont"><a data-scroll href="mailto:info@yoursite.com">info@Lifecare.com</a></span>	
                            </div>
                            <div class="info-inner">
                                <span class="icontop"><i class="fa fa-clock-o" aria-hidden="true"></i></span>
                                <span class="iconcont"><a data-scroll href="#">Daily: 7:00am - 8:00pm</a></span>	
                            </div>
                            <div class="info-inner">
                                <ul class="list-main">
                                    <li><i class="fa fa-user-circle"></i> <a href="#">My account</a></li>
                                    <li><i class="fa fa-sign-in"></i><a href="login">Login</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="header-bottom wow fadeIn">
                <div class="container">
                    <nav class="main-menu">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar"><i class="fa fa-bars" aria-hidden="true"></i></button>
                        </div>

                        <div id="navbar" class="navbar-collapse collapse">
                            <ul class="nav navbar-nav">
                                <li><a class="active" href="index.html">Home</a></li>
                                <li><a data-scroll href="#about">About us</a></li>
                                <li><a data-scroll href="#service">Services</a></li>
                                <li><a data-scroll href="#doctors">Doctors</a></li>
                                <li><a data-scroll href="#price">Price</a></li>
                                <li><a data-scroll href="#testimonials">Testimonials</a></li>
                                <li><a data-scroll href="#getintouch">Contact</a></li>
                            </ul>
                        </div>
                    </nav>
                    <div class="serch-bar">
                        <div id="custom-search-input">
                            <div class="input-group col-md-12">
                                <input type="text" class="form-control input-lg" placeholder="Search" />
                                <span class="input-group-btn">
                                    <button class="btn btn-info btn-lg" type="button">
                                        <i class="fa fa-search" aria-hidden="true"></i>
                                    </button>
                                </span>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </header>

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



        <!--        <div class="register">
                    <h2 class="title">Register New Account</h2>
                    <form action="register" method="POST">
                        <p class="text-danger">${mess}</p>
                        <div class="enter">
                            First Name: <input type="text" name="fname" ><br>
                        </div>
                        <div class="enter">
                            Last Name: <input type="text" name="lname" ><br>
                        </div>
                        <div class="enter">
                            Username: <input type="text" name="username" ><br>
                        </div>
                        <div class="enter">
                            Password: <input id="pass" type="password" minlength="8" name="password" >
                            <img onclick="myFunction1()" src="images/eye1.jpg" width="30" height="30">
                        </div>
                        <div class="enter">
                            Confirm Password: <input id="pass1" type="password" minlength="8" name="confirm">
                            <img onclick="myFunction2()" src="images/eye2.jpg" width="30" height="30">
                        </div>
                        <div class="enter">
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
                        <div class="enter">
                            Email: <input type="email" name="email"><br>
                        </div>
                        <div class="enter">
                            Phone: <input type="text" name="phonenumber" ><br>
                        </div>
                        <div class="enter">
                            Age: <input type="text" name="age" ><br>
                        </div>
                        <div class="enter">
                            Status: <input type="text" name="status" ><br>
                        </div>
                        <div class="enter">
                            Address: <input type="text" name="address"><br><br>
                        </div>
                        <button>Register</button>
                        <input style="padding: 10px" type="submit" value="Save">
                    </form>
                </div>-->

        <div class="main-w3layouts wrapper">
            <h1>Register Form</h1>
            <div class="main-agileinfo">
                <div class="agileits-top">
                    <form action="register" method="post">
                        <p class="text-danger">${mess}</p>
                        <input class="text" type="text" name="fname" placeholder="First Name" required="">
                        <input class="text" type="text" name="lname" placeholder="Last Name" required="">
                        <input class="text" type="text" name="username" placeholder="Username" required="">
                        <input id="pass" class="text" type="password" name="password" minlength="8" placeholder="Password" required="">
                        <img onclick="myFunction1()" src="images/eye2.jpg" width="30" height="30">
                        <input id="pass1"  type="password" name="confirm" minlength="8" placeholder="Confirm Password" required="">
                        <img onclick="myFunction2()" src="images/eye2.jpg" width="30" height="30">
                        <div class="enter">
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
                        <input class="text " type="email" name="email" placeholder="Email" required="">
                        <input class="text" type="text" name="phonenumber" placeholder="Phone Number" required="">
                        <input class="text" type="text" name="age" placeholder="Age" required="">
                        <input class="text" type="text" name="status" placeholder="Status" required="">
                        <input class="text" type="text" name="address" placeholder="Address" required="">
                        <div class="wthree-text">
                            <label class="anim">
                                <input type="checkbox" class="checkbox" required="">
                                <span>I Agree To The Terms & Conditions</span>
                            </label>
                            <div class="clear"> </div>
                        </div>
                        <input type="submit" value="SIGN UP">
                    </form>
                </div>
            </div>
        </div>


        <footer id="footer" class="footer-area wow fadeIn">
            <div class="container">
                <div class="row">
                    <div class="col-md-4">
                        <div class="logo padding">
                            <a href=""><img src="images/logo.png" alt=""></a>
                            <p>Locavore pork belly scen ester pine est chill wave microdosing pop uple itarian cliche artisan.</p>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="footer-info padding">
                            <h3>CONTACT US</h3>
                            <p><i class="fa fa-map-marker" aria-hidden="true"></i> PO Box 16122 Collins Street West Victoria 8007 Australia</p>
                            <p><i class="fa fa-paper-plane" aria-hidden="true"></i> info@gmail.com</p>
                            <p><i class="fa fa-phone" aria-hidden="true"></i> (+1) 800 123 456</p>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="subcriber-info">
                            <h3>SUBSCRIBE</h3>
                            <p>Get healthy news, tip and solutions to your problems from our experts.</p>
                            <div class="subcriber-box">
                                <form id="mc-form" class="mc-form">
                                    <div class="newsletter-form">
                                        <input type="email" autocomplete="off" id="mc-email" placeholder="Email address" class="form-control" name="EMAIL">
                                        <button class="mc-submit" type="submit"><i class="fa fa-paper-plane"></i></button> 
                                        <div class="clearfix"></div>
                                        <!-- mailchimp-alerts Start -->
                                        <div class="mailchimp-alerts">
                                            <div class="mailchimp-submitting"></div>
                                            <!-- mailchimp-submitting end -->
                                            <div class="mailchimp-success"></div>
                                            <!-- mailchimp-success end -->
                                            <div class="mailchimp-error"></div>
                                            <!-- mailchimp-error end -->
                                        </div>
                                        <!-- mailchimp-alerts end -->
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
        <div class="copyright-area wow fadeIn">
            <div class="container">
                <div class="row">
                    <div class="col-md-8">
                        <div class="footer-text">
                            <p>© 2018 Lifecare. All Rights Reserved.</p>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="social">
                            <ul class="social-links">
                                <li><a href=""><i class="fa fa-rss"></i></a></li>
                                <li><a href=""><i class="fa fa-facebook"></i></a></li>
                                <li><a href=""><i class="fa fa-twitter"></i></a></li>
                                <li><a href=""><i class="fa fa-google-plus"></i></a></li>
                                <li><a href=""><i class="fa fa-youtube"></i></a></li>
                                <li><a href=""><i class="fa fa-pinterest"></i></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <a href="#home" data-scroll class="dmtop global-radius"><i class="fa fa-angle-up"></i></a>
        <!-- all js files -->
        <script src="js/all.js"></script>
        <!-- all plugins -->
        <script src="js/custom.js"></script>
        <!-- map -->
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCNUPWkb4Cjd7Wxo-T4uoUldFjoiUA1fJc&callback=myMap"></script>

        <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
        <script src="https://unpkg.com/scrollreveal"></script>
        <script src="./js/main.js"></script>

        <script type="text/javascript">
    var x = true;
    function myFunction1() {
        if (x) {
            document.getElementById('pass').type = "text";
            x = false;
        } else {
            document.getElementById('pass').type = "password";
            x = true;
        }
    }
        </script>
        <script type="text/javascript">
            var x = true;
            function myFunction2() {
                if (x) {
                    document.getElementById('pass1').type = "text";
                    x = false;
                } else {
                    document.getElementById('pass1').type = "password";
                    x = true;
                }
            }
        </script>
    </body>
</html>
