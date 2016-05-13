<!--
Created by IntelliJ IDEA.
User: Avinash
Date: 3/24/2016
Time: 9:50 PM
To change this template use File | Settings | File Templates.
-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Expert Login</title>
    <link rel="stylesheet" href="css/style.css">
    <style type="text/css">
        body {
            font-family: Verdana;
            font-size: 15px
        }

        div#back_glob {
            background-color: white;
            border: 1px solid #8DCB89;
            width: 350px;
            margin: 0 auto;
            box-shadow: 1px 0px 15px #8DCB89
        }

        input {
            display: block;
            margin: 10px;
        }

        div#back_header {
            background-color: #8DCB89;
            text-align: center;
            font-size: 22px;
            font-weight: bold;
            color: white;
            padding: 20px;
        }

        input[type=text], input[type=password] {
            font-weight: bold;
            padding: 10px;
            border-radius: 3px;
            border: 1px solid #2d2d2d;
        }

        input[type=submit] {
            background-color: #8DCB89;
            padding: 5px 10px 5px 10px;
            border: 1px solid #E74E59;
            color: white;
            font-weight: bold
        }

        div#back_form {
            display: flex;
            justify-content: center;
        }

        body {
            background-image: url('../images/plant.jpg');
            background-repeat: repeat-x;
            background-size: cover
        }
    </style>

</head>


<div id="back_glob">
    <div id="back_header">
        EXPERT LOGIN
    </div>
    <p style="color: red;" align="center"><%

        Object o = request.getAttribute("status");
        if (o == null) {
        } else {

            if (o.toString().equals("Invalid Login Credentials")) {
                out.println("Invalid Login Credentials");
            } else {

            }


        }
    %></p><br>

    <div id="back_form">

        <form action="/servlogin" method="post">
            <input type="text" placeholder="Username" id="username" name="username">

            <input id="passwd" type="password" placeholder="Password" name="password">
            <input type="submit" value="Login">

        </form>
    </div>
</div>


</html>
