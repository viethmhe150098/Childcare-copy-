<%-- 
    Document   : ManagerHomePage
    Created on : Oct 17, 2021, 5:28:02 PM
    Author     : Viet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap" rel="stylesheet">
    <title>Document</title>
    <style>
        .TopBar {
            width: 100%;
            height: 50px;
            background-color: white;
            position: sticky;
            top: 0;
            display: flex;
            align-items: center;
            z-index: 999;

        }

        .TopLeft,
        .TopRight {
            flex: 1;
            display: flex;
            align-items: center;
            justify-content: center;

        }

        .topicon {
            font-size: 18px;
        }

        .TopCenter {
            flex: 6;

        }

        .topList {
            display: flex;
            justify-content: center;
            margin: 0;
            padding: 0;
            list-style: none;
        }

        .topListItem {
            margin-right: 20px;
            font-size: 18px;
            font-weight: 300;
            cursor: pointer;

        }

        .ListCard {
            margin-top: 20px;
            height: 300px;
            width: 100%;


        }

        .card_1st {
            height: 100%;
            background-color: green;
            opacity: 0.3;
        }

        .card:first-child {
            margin-left: 25px;
        }

        .card-content {
            text-align: center;
            font-size: 100px;
            color: white;
        }

        .topListItem:hover {
            color: lightgray;
        }

        .ListCard_2th {
            width: 100%;
            margin-top: 20px;
            display: flex;
            padding: 10px;

            height: 400px;
        }

        .Card_2th {
            padding-top: 10px;
            border: 1px solid black;
            border-radius: 10px;
            min-height: 100%;
        }
        .card_content{
            padding-left: 10px;
            height: 300px;
            padding-bottom: 0px;
            overflow-y: scroll;
        }
    </style>
</head>

<body>
    <div>
        <div class="TopBar">
            <div class="TopLeft">
                <div class="topicon">
                    <h5>CHILDCARE SYSTEM</h5>
                </div>
            </div>
            <div class="TopCenter">
                <ul class="topList">
                    <li class="topListItem">
                        <h5>HOME</h5>
                    </li>
                    <li class="topListItem">
                        <h5>RESERVATION</h5>
                    </li>
                    <li class="topListItem">
                        <h5>POST</h5>
                    </li>
                    <li class="topListItem">
                        <h5>FEEDBACK</h5>
                    </li>
                    <li class="topListItem">
                        <h5>MEDICINE</h5>
                    </li>
                    <li class="topListItem">
                        <h5>SLOT</h5>
                    </li>
                </ul>
            </div>
            <div class="TopRight">C</div>
        </div>
        <div class="row ListCard">
            <div class="col-sm-4">
                <div class="card card_1st">
                    <div class="card-body">
                        <h5 class="card-title" style="text-align: center; color: white; ">RESERVATION</h5>
                        <p class="card-text card-content">1000</p>

                    </div>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="card card_1st">
                    <div class="card-body">
                        <h5 class="card-title" style="text-align: center; color: white;">INCOME</h5>
                        <p class="card-text card-content">10000$</p>

                    </div>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="card card_1st">
                    <div class="card-body">
                        <h5 class="card-title" style="text-align: center; color: white;">NEW ACCOUNT THIS MONTH</h5>
                        <p class="card-text card-content">1000</p>

                    </div>
                </div>
            </div>
        </div>
        <div class="row ListCard_2th">
            <div class="col-sm-6">
                <div class="card Card_2th">
                    <h5 style="text-align: center;">PENDING RESERVATION</h5>
                    <div class="card_content">
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam semper diam at erat pulvinar,
                            at pulvinar felis blandit. Vestibulum volutpat tellus diam,
                            consequat gravida libero rhoncus ut.</p>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam semper diam at erat pulvinar,
                            at pulvinar felis blandit. Vestibulum volutpat tellus diam,
                            consequat gravida libero rhoncus ut.</p>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam semper diam at erat pulvinar,
                            at pulvinar felis blandit. Vestibulum volutpat tellus diam,
                            consequat gravida libero rhoncus ut.</p>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam semper diam at erat pulvinar,
                            at pulvinar felis blandit. Vestibulum volutpat tellus diam,
                            consequat gravida libero rhoncus ut.</p>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam semper diam at erat pulvinar,
                            at pulvinar felis blandit. Vestibulum volutpat tellus diam,
                            consequat gravida libero rhoncus ut.</p>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam semper diam at erat pulvinar,
                            at pulvinar felis blandit. Vestibulum volutpat tellus diam,
                            consequat gravida libero rhoncus ut.</p>
                            
                    </div>
                </div>

            </div>
            <div class="col-sm-6" style="text-align: center;">
                <div class="card Card_2th">
                    <h5>NEWEST POST</h5>
                </div>
            </div>
        </div>
    </div>
</body>

</html>
