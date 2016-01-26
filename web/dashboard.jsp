<%@ page import="major.appengine.connector.GQLResultSetFetcher" %>
<%--
  Created by  Anurag Ambuj
  Date: 1/24/2016
  Time: 1:35 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Jai Kisaan Notification Portal </title>
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
<!-- Header Code -->
<header id="header">
    <h1 id="logo"><a href="index.jsp">JAI KISAAN WEB</a></h1>
    <nav id="nav">
        <ul>

            <!--
            Commented to block logging out redirection to home
            <li><a href="index.jsp">Home</a></li>
            <li>
                <a href="#">Layouts</a>
                <ul>
                    <li><a href="left-sidebar.html">Left Sidebar</a></li>
                    <li><a href="right-sidebar.html">Right Sidebar</a></li>
                    <li><a href="no-sidebar.html">No Sidebar</a></li>
                    <li>
                        <a href="#">Submenu</a>
                        <ul>
                            <li><a href="#">Option 1</a></li>
                            <li><a href="#">Option 2</a></li>
                            <li><a href="#">Option 3</a></li>
                            <li><a href="#">Option 4</a></li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li><a href="GAEElementRefUsage.html">Elements</a></li>
            -->

            <li><a href="#" class="button special">
                <%
                    Object mailobject = request.getAttribute("email");
                    Object firstname = request.getAttribute("firstname");
                    Object secondname = request.getAttribute("secondname");
                    if (mailobject != null) {
                        out.println("Logged In Mail: " + mailobject.toString());
                    }

                %>
            </a></li>
            <li><a href="#" class="button special"><%
                if (firstname != null && secondname != null)
                    out.println("Hello " + firstname.toString() + " " + secondname.toString());
            %></a></li>
            <li><a href="login.jsp" class="button special">Logout</a></li>
        </ul>
    </nav>
</header>

<!-- notification bodies -->
<br>
<br>
<br>
<p style="border: thin;border-style: solid;">
    Crop Sown: <%
    GQLResultSetFetcher gqlResultSetFetcher = new GQLResultSetFetcher();
    String crop = gqlResultSetFetcher.getCropFromEmail(mailobject.toString());
    out.println(crop);
%>
</p>

<p style="border: thin;border-style: solid;">
    Sowing Time: <%
    out.println(gqlResultSetFetcher.getSowingTimeFromEmail(mailobject.toString()));
%>
</p>

<p style="border: thin;border-style: solid;">
    Location: <%
    out.println(gqlResultSetFetcher.getLocationFromEmail(mailobject.toString()));
%>
</p>
<div align="center">
<table class="alt">
    <tr>
        <td>
            <b>Pest</b>
        </td>
        <td>
            <b>Pesticide</b>
        </td>
        <td>
            <b>Pesitcide Dose</b>
        </td>
    </tr>
    <tr>
        <td>
            <% out.println(gqlResultSetFetcher.getPest1FomCrop(crop.trim())); %>
        </td>
        <td>
            <%
                out.println(gqlResultSetFetcher.getPesticide1FomCrop(crop.trim()));
            %>
        </td>
        <td>
            <% out.println(gqlResultSetFetcher.getPesticidedose1FromCrop(crop.trim())); %>
        </td>
    </tr>
    <tr>
        <td>
            <% out.println(gqlResultSetFetcher.getPest2FomCrop(crop.trim())); %>
        </td>
        <td>
            <%
                out.println(gqlResultSetFetcher.getPesticide2FomCrop(crop.trim()));
            %>
        </td>
        <td>
            <% out.println(gqlResultSetFetcher.getPesticidedose2FromCrop(crop.trim())); %>
        </td>
    </tr>
    <tr>
        <td>
            <% out.println(gqlResultSetFetcher.getPest3FomCrop(crop.trim())); %>
        </td>
        <td>
            <%
                out.println(gqlResultSetFetcher.getPesticide3FomCrop(crop.trim()));
            %>
        </td>
        <td>
            <% out.println(gqlResultSetFetcher.getPesticidedose3FromCrop(crop.trim())); %>
        </td>
    </tr>
</table>
</div>

<!-- Footer Code -->
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
