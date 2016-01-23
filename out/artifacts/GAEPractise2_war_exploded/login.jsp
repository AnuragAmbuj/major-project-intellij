<%--
  Created by  Anurag Ambuj
  Date: 1/23/2016
  Time: 10:34 AM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login for Kisaan</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
    <link rel="stylesheet" href="assets/css/main.css" />
    <!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
    <!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
</head>
<body>
<header id="header">
    <h1 id="logo"><a href="index.jsp">JAI KISAAN WEB</a></h1>
    <nav id="nav">
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li>
                <a href="#">Layouts</a>
            </li>
            <li><a href="register.jsp" class="button special">Sign Up</a></li>
        </ul>
    </nav>
</header>
<br><br>
<div align="center">
<div align="center" style="width: 60%;align-items: center;align-content: center">
    <form id="loginpage" name="loginpage" action="login.jsp" method="post">
        <table>
            <tr>
                <td>
                    <input type="text" name="email" placeholder="Enter Email"><br>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="password" name="password" placeholder="Enter a password"><br>
                </td>
            </tr>
        </table>
        <input type="SUBMIT" align="center" value="Login"><br>
    </form>
</div>
</div>
<!-- Scripts -->
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/jquery.scrolly.min.js"></script>
<script src="assets/js/jquery.dropotron.min.js"></script>
<script src="assets/js/jquery.scrollex.min.js"></script>
<script src="assets/js/skel.min.js"></script>
<script src="assets/js/util.js"></script>
<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
<script src="assets/js/main.js"></script>
</body>
</html>
