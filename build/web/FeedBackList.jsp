<%-- 
    Document   : FeedBackList
    Created on : Oct 15, 2021, 8:34:44 PM
    Author     : ADMIN
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
    <title>Life Care - Responsive HTML5 Multi Page Template</title>
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
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
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
</head>
<body class="clinic_version" style="background:
#EEEEEE">
    <!-- LOADER -->
    <div id="preloader">
        <img class="preloader" src="images/loaders/heart-loading2.gif" alt="">
    </div>
    <!-- END LOADER -->
    <header>
        <div class="header-top fadeIn">
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
                    </div>
                </div>
            </div>
        </div>
        <div class="header-bottom fadeIn">
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
    <!-- end section -->
    <div id="about" class="section wow fadeIn" style="padding:0; margin:0;">
        <div class="container">
            <div class="heading">
                <span class="icon-logo"><img src="images/icon-logo.png" alt="#"></span>
                <h2>The Feedback List</h2>
            </div>
            <div class="handleform" style="margin-bottom:20px;">
                <form method="post" style="margin-bottom:20px; text-align: center" action="SearchingFeedback?service=searchBy" class="form-inline" id="searchForm" name="searchObject">
                <select class="form-control" id="trangThai" name="status">
                    <option  value="4">All</option>
                    <option value="0">Name <i class="fas fa-male"></i></option>
                    <option value="1">Star <i class="fas fa-star-half-alt"></i></option><!--
                    <option ${checkStatus == 2?"selected":""} value="2">Status2</option>     
                    <option ${checkStatus == 3?"selected":""} value="3">Name</option> -->
                </select>
                <button  type="submit" class="bg-secondary" id="btnDuyetDonHang">Filter</button>
            </form>
                 <form action="searchFeedback" method="post">
                <div class="search1" style="width: 40% ;margin: 0 auto;">
                    <input type="text" value="${txtS}" name="name" placeholder="Type your search :" />
                    <button  type="submit" style=" background: -webkit-linear-gradient(left, #39b49a 0%, #1d86df 100%);
                             background: linear-gradient(to right, #39b49a 0%, #1d86df 100%);">Search</button>
                             </div>
            </form>
            </div>
                 
           
           
            <!-- end title -->
                             <c:forEach items="${listFeedback}" var="o">
                                 <div class="container">
                                          <div class="row">
                <div class="col-md-6">
                    <div class="message-box">
                        <div style="padding:15px ; background:#fff;border-radius:5px;margin-bottom: 15px;">
                             <h4>${o.fID}</h4>
                             <h2><a href="FeedbackDetailControl?fID=${o.fID}#about" style="margin:0 auto;">${o.name}</a></h2>
                       
                   
                            <div class="service-price" style="margin-top:10px; background-color:#39b49a;color:white;width: 10%; ">
                               
                                                                <p style="text-align:center;">${o.star} <i class="fas fa-star-half-alt"></i></p>

                               
                        </div>
                        <p class="lead">${o.content}</p>
                       
                         </div>
                                    </div>
                         <button class="w3-left w3-button w3-white w3-border" onclick="likeFunction(this)"><b>&#10003 Like</b></button></p>
                            <button class="w3-right w3-button w3-black mtl" onclick="myFunction('demo3')"
                                id="myBtn"><b>Replies
                                    &nbsp;</b> <span class="w3-tag w3-white">1</span></button></p>
                            <p class="w3-clear"></p>
                            

                    </div>
                    <!-- end messagebox -->
               
                <!-- end col -->
                <div class="col-md-6">
                    <div class="post-media wow fadeIn" >
                        <img src="images/anhyte.png" alt="" class="img-responsive" style="height:280px; margin-bottom: 25px;">
                    </div>
                    <!-- end media -->
                </div>
                <!-- end col -->
                
                                         </c:forEach>
                  </div>

            <div class="container text-center">
            <ul class="pagination">
                <c:if test="${tag>1}">
                    <li class="page-item "><a class="page-link" href="FeedbackControl?index=${tag-1}#about">Previous</a></li>
                    </c:if>
                    <c:forEach begin="1" end="${endP}" var="i">

                    <li class="page-item ${tag== i? "active" :""}"><a class="page-link" href="FeedbackControl?index=${i}#about">${i}</a></li>
                    </c:forEach>
                    <c:if test="${tag<endP}">


                    <li class="page-item"><a class="page-link" href="FeedbackControl?index=${tag+1}#about">Next</a></li>
                    </c:if>
            </ul>
        </div>  
      
                                 </div>
       
        <!-- end row -->
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
                            <p>?? 2018 Lifecare. All Rights Reserved.</p>
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
        <script>
        // Toggle between hiding and showing blog replies/comments
        document.getElementById(" myBtn").click(); function myFunction(id) {
            var x = document.getElementById(id); if
                (x.className.indexOf("w3-show") == -1) { x.className += " w3-show"; } else {
                x.className = x.className.replace(" w3-show", "");
            }
           
        }
        const isPlaying = false;
         function likeFunction(x) {
            if(this.isPlaying){
                x.style.fontWeight = "bold"; x.innerHTML = "&#10003; Like";
                this.isPlaying=false;
            }else {
                x.style.fontWeight = "bold"; x.innerHTML = "&times; UnLike";
                this.isPlaying = true;

            }
            
        }
          function dieu_huong(){
            location.assign("http://localhost:63270/ChildCare/ServiceControl");
        }
            </script>

</body>   
</html>