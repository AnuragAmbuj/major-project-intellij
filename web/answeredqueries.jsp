<%@ page import="major.appengine.connector.GQLResultSetFetcher" %>
<%@ page import="major.jaikisaan.datamodel.QAModel" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="javax.swing.text.html.parser.Entity" %>
<%@ page import="java.util.StringTokenizer" %><%--
  Created by  Anurag Ambuj
  Date: 4/16/2016
  Time: 6:51 AM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Answered Queries</title>
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
<!-- body bgins -->
<br>
<br>
<div>
    <table>
        <%
            ArrayList<QAModel> arrayList = GQLResultSetFetcher.getAllAnsweredQueries();
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
                com.google.appengine.api.datastore.Entity entity = GQLResultSetFetcher.getEntityFromQuery(arrayList.get(i).getQuery());
                Object ans = entity.getProperty("answers");
                if (ans == null) {

                } else {
                    String s = ans.toString();
                    StringTokenizer tokens = new StringTokenizer(s, ";");
                    if (tokens.hasMoreTokens())
                        out.println(tokens.nextToken());
                    out.println("<br>");
                    if (tokens.hasMoreTokens())
                        out.println(tokens.nextToken());
                    out.println("<br>");
                    if (tokens.hasMoreTokens())
                        out.println(tokens.nextToken());
                    if (tokens.hasMoreTokens())
                        out.println(tokens.nextToken());
                    out.println("<br>");
                    if (tokens.hasMoreTokens())
                        out.println(tokens.nextToken());
                    out.println("<br>");
                    if (tokens.hasMoreTokens())
                        out.println(tokens.nextToken());
                    out.println("<br>");
                    if (tokens.hasMoreTokens())
                        out.println(tokens.nextToken());
                    out.println("<br>");
                    if (tokens.hasMoreTokens())
                        out.println(tokens.nextToken());
                    out.println("<br>");
                    if (tokens.hasMoreTokens())
                        out.println(tokens.nextToken());
                    out.println("<br>");
                }

                out.println("<br>");
                out.println("<form method='get' action='/multianswerhandle'>");
                out.println("<input type='text' name='query' value='" + arrayList.get(i).getQuery() + "'");
                out.println("<br>");
                out.println("<br>");
                out.println("<textarea type='text' name='multipleanswer' rows='10' cols='20'>Answer Query</textarea>");
                out.println("<br>");
                out.println("<input type='submit' value='Submit another answer'>");
                out.println("</form>");
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
