<%@ page import="major.appengine.connector.GQLResultSetFetcher" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="major.jaikisaan.datamodel.QAModel" %>
<%@ page import="java.util.List" %><%--
  Created by  Anurag Ambuj
  Date: 4/15/2016
  Time: 11:51 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Answer From Experts</title>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <!--[if lte IE 8]>
    <script src="assets/js/ie/html5shiv.js"></script><![endif]-->
    <link rel="stylesheet" href="../assets/css/main.css"/>
    <!--[if lte IE 9]>
    <link rel="stylesheet" href="../assets/css/ie9.css"/><![endif]-->
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="../assets/css/ie8.css"/><![endif]-->
</head>
<body>
<!-- Header -->
<header id="header">
    <h1 id="logo"><a href="../index.jsp">JAI KISAAN WEB</a></h1>
</header>
<br>
<br>
<br>
<br>
<div>
<h2 align="center">Unanswerd Questions for experts to answer</h2>
<!-- Qlist -->
<p><%
    Object o= request.getAttribute("status");
    if(o==null)
    {

    }else
    {
        String status=o.toString();
        out.println(status);
    }
%></p>
<table>
<%
    GQLResultSetFetcher fetcher = new GQLResultSetFetcher();
    List<QAModel> qaModelArrayList=fetcher.getAllUnasweredQueries();

    for(int i=0;i<qaModelArrayList.size();i++)
    {
        out.println("<tr>");
        out.println("<td>");
        out.println(qaModelArrayList.get(i).getQuery());
        out.println("<br>");
        out.println("CROP:"+qaModelArrayList.get(i).getCrop());
        out.println("<br>");
        out.println("STAGE:"+qaModelArrayList.get(i).getStage());
        out.println("</td>");
        out.println("<td>");
        out.println("<a href='/queryanswerswerv?query="+qaModelArrayList.get(i).getQuery()+"'>Answer Query</a>");
        out.println("</td>");
        out.println("</tr>");
    }
%>
</table>
</div>

<!-- Footer section
<footer id="footer">
    <ul class="icons">
        <li><a href="https://github.com/AnuragAmbuj/major-project" class="icon alt fa-github"><span
                class="label">GitHub</span></a>
        </li>
        <li><a href="mailto:anuragambuj000@gmail.com" class="icon alt fa-envelope"><span class="label">Email</span></a>
        </li>
    </ul>
    <ul class="copyright">
        <li>&copy; Jai Kisaan Major Project</li>
        <li>UI/UX Inspiration: <a href="http://html5up.net">HTML5 UP</a></li>
    </ul>
</footer>-->
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
