<%@ page import="major.jaikisaan.datamodel.QAModel" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.StringTokenizer" %>
<%@ page import="major.appengine.connector.GQLResultSetFetcher" %>
<%@ page import="com.google.appengine.api.datastore.Entity" %>
<%--
  Created by  Anurag Ambuj
  Date: 4/16/2016
  Time: 6:51 AM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Results</title>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <!--[if lte IE 8]>
    <script src="assets/js/ie/html5shiv.js"></script><![endif]-->
    <link rel="stylesheet" href="assets/css/main.css"/>
    <!--[if lte IE 9]>
    <link rel="stylesheet" href="assets/css/ie9.css"/><![endif]-->
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="assets/css/ie8.css"/><![endif]-->
</head>
<body>
<header id="header">
    <h2 id="logo"><a href="index.jsp">JAI KISAAN WEB</a></h2>
    <nav id="nav">
        <ul>
            <form action="/searchres" method="get">
                <input type="search" name="searchkey" placeholder="Search Keywords">
                <button type="submit">Search</button>
            </form>
        </ul>
    </nav>
</header>
<br>
<br>
<!-- body bgins -->
<div>
    <%
        Object o = request.getAttribute("searchlist");
        if (o == null)
            response.sendError(404);
        ArrayList<QAModel> arrayList = (ArrayList<QAModel>) o;

    %>
    <h3>Searching for <%= request.getAttribute("key")%> produced <%=arrayList.size()%> results.</h3>
    <table>
        <%

            for (int i = 0; i < arrayList.size(); i++) {

                out.println("<tr>");
                out.println("<td>");
                out.println(arrayList.get(i).getQuery());
                out.println("<br>");
                out.println("CROP:" + arrayList.get(i).getCrop());
                out.println("<br>");
                out.println("STAGE:" + arrayList.get(i).getStage());
                out.println("</td>");
                out.println("<td>");
                out.println(arrayList.get(i).getAnswer());
                out.println("<br>");
                Entity entity = GQLResultSetFetcher.getEntityFromQuery(arrayList.get(i).getQuery());
                if (entity.getProperty("answers") == null) {

                } else {
                    StringTokenizer tokenizer = new StringTokenizer(entity.getProperty("answers").toString(), ";");
                    if (tokenizer.hasMoreTokens()) {
                        out.println(tokenizer.nextToken());
                        out.println("<br>");
                    }
                    if (tokenizer.hasMoreTokens()) {
                        out.println(tokenizer.nextToken());
                        out.println("<br>");
                    }
                    if (tokenizer.hasMoreTokens()) {
                        out.println(tokenizer.nextToken());
                        out.println("<br>");
                    }
                    if (tokenizer.hasMoreTokens()) {
                        out.println(tokenizer.nextToken());
                        out.println("<br>");
                    }
                    if (tokenizer.hasMoreTokens()) {
                        out.println(tokenizer.nextToken());
                        out.println("<br>");
                    }
                }
                out.println("</td>");
                out.println("</tr>");
            }
        %>
    </table>
</div>

<!-- Footer Code -->
<!--<footer id="footer">
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
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/jquery.scrolly.min.js"></script>
<script src="assets/js/jquery.dropotron.min.js"></script>
<script src="assets/js/jquery.scrollex.min.js"></script>
<script src="assets/js/skel.min.js"></script>
<script src="assets/js/util.js"></script>
<!--[if lte IE 8]>
<script src="assets/js/ie/respond.min.js"></script><![endif]-->
<script src="assets/js/main.js"></script>
</body>
</html>
