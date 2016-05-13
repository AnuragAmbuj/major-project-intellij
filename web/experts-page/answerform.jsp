<%@ page import="com.google.appengine.api.datastore.Entity" %><%--
  Created by  Anurag Ambuj
  Date: 4/16/2016
  Time: 6:01 AM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Answer Query</title>
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
    <h2>Answer query</h2>
    <p>
        <%
            Object object = request.getAttribute("entity");
            if(object == null)
                response.sendError(404);
            Entity entity =(Entity)object;
            String query=entity.getProperty("query").toString();

        %>
    </p>
    <p>
        <form action="/qasubmit" method="post">
        <textarea name="query" hidden="hidden"><%out.println(query);%></textarea>
        <textarea name="answer" rows="10" cols="100">Your answer to the query</textarea>
        <input type="submit" value="Submit answer">
    </form>
    </p>




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
</footer>
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
