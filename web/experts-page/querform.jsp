<%--
  Created by  Anurag Ambuj
  Date: 2/7/2016
  Time: 10:45 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Queries</title>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <!--[if lte IE 8]>
    <script src="../assets/js/ie/html5shiv.js"></script><![endif]-->
    <link rel="stylesheet" href="../assets/css/main.css"/>
    <!--[if lte IE 9]>
    <link rel="stylesheet" href="../assets/css/ie9.css"/><![endif]-->
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="../assets/css/ie8.css"/><![endif]-->
</head>
<body>
<header id="header">
    <h1 id="logo"><a href="../index.jsp">JAI KISAAN WEB</a></h1>
    <nav id="nav">
        <ul>


        </ul>
    </nav>
</header>
<h2 align="center">PAGES FOR SOLANACEAE</h2>

<h2 align="center">Feedback</h2>

<div align="center">
    <p align="center"><%
        Object status = request.getAttribute("status");
        if (status == null) {

        } else {
            out.println(status.toString());
        }
    %></p>
    <form id=" " name=" " action="/expertqueryhandler" method="post">

        <table>
            <tr align="center">
                <td>
                    Enter Name:<br>
                    <input type="text" name="name" placeholder="Name" required="required"><br>
                </td>
            </tr>
            <tr align="center">
                <td>
                    Enter email:<br>
                    <input type="text" name="email" placeholder="Enter Email" required="required"><br>
                </td>
            </tr>
            <tr align="center">
                <td>
                    <select name="cropselector" required="required">
                        <option value="none">Select a crop</option>
                        <option value="Tomato">Tomato</option>
                        <option value="Chilli">Chilli</option>
                        <option value="Potato">Potato</option>
                    </select>
                </td>
            </tr>
            <tr align="center">
                <td>
                    Select stage of your crop:
                    <select name="stage" required="required">
                        <option value="Germination">Germination</option>
                        <option value="Adult">Adult</option>
                        <option value="Flowering">Flowering</option>
                        <option value="Fruit">Fruit</option>
                    </select>
                </td>
            </tr>
            <tr align="center">
                <td>
                    <select name="slist" required="required">
                        <option value="none">------------Select State------------</option>
                        <option value="Andaman and Nicobar Islands">Andaman and Nicobar Islands</option>
                        <option value="Andhra Pradesh">Andhra Pradesh</option>
                        <option value="Arunachal Pradesh">Arunachal Pradesh</option>
                        <option value="Assam">Assam</option>
                        <option value="Bihar">Bihar</option>
                        <option value="Chandigarh">Chandigarh</option>
                        <option value="Chhattisgarh">Chhattisgarh</option>
                        <option value="Dadra and Nagar Haveli">Dadra and Nagar Haveli</option>
                        <option value="Daman and Diu">Daman and Diu</option>
                        <option value="Delhi">Delhi</option>
                        <option value="Goa">Goa</option>
                        <option value="Gujarat">Gujarat</option>
                        <option value="Haryana">Haryana</option>
                        <option value="Himachal Pradesh">Himachal Pradesh</option>
                        <option value="Jammu and Kashmir">Jammu and Kashmir</option>
                        <option value="Jharkhand">Jharkhand</option>
                        <option value="Karnataka">Karnataka</option>
                        <option value="Kerala">Kerala</option>
                        <option value="Lakshadweep">Lakshadweep</option>
                        <option value="Madhya Pradesh">Madhya Pradesh</option>
                        <option value="Maharashtra">Maharashtra</option>
                        <option value="Manipur">Manipur</option>
                        <option value="Meghalaya">Meghalaya</option>
                        <option value="Mizoram">Mizoram</option>
                        <option value="Nagaland">Nagaland</option>
                        <option value="Orissa">Orissa</option>
                        <option value="Pondicherry">Pondicherry</option>
                        <option value="Punjab">Punjab</option>
                        <option value="Rajasthan">Rajasthan</option>
                        <option value="Sikkim">Sikkim</option>
                        <option value="Tamil Nadu">Tamil Nadu</option>
                        <option value="Tripura">Tripura</option>
                        <option value="Uttaranchal">Uttaranchal</option>
                        <option value="Uttar Pradesh">Uttar Pradesh</option>
                        <option value="West Bengal">West Bengal</option>
                    </select>
                </td>
            </tr>
            <tr align="center">
                <td><textarea name="query" placeholder="Please enter the complete problem?" rows="4"
                              cols="120"></textarea></td>
            </tr>
        </table>
        <input type="SUBMIT" align="center" value="Send Query"><br>

    </form>
</div>
<script src="../assets/js/jquery.min.js"></script>
<script src="../assets/js/jquery.scrolly.min.js"></script>
<script src="../assets/js/jquery.dropotron.min.js"></script>
<script src="../assets/js/jquery.scrollex.min.js"></script>
<script src="../assets/js/skel.min.js"></script>
<script src="../assets/js/util.js"></script>
<!--[if lte IE 8]>
<script src="../assets/js/ie/respond.min.js"></script><![endif]-->
<script src="../assets/js/main.js"></script>
</body>
</html>
