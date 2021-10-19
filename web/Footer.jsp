<%-- 
    Document   : Footer
    Created on : Oct 19, 2021, 2:29:56 PM
    Author     : DO THANH TRUNG
--%>

<%@page import="Entity.Customer"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                        <form id="mc-form" class="mc-form" action="addSubcribe" method="post">
                            <div class="newsletter-form">
                                <input type="email" autocomplete="off" id="mc-email" placeholder="Email address" class="form-control" name="email">
                                <button class="mc-submit" type="submit"><i class="fa fa-paper-plane"></i></button> 

                                <!-- mailchimp-alerts Start -->

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
