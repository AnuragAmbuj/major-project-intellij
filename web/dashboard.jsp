<%@ page import="major.appengine.connector.GQLResultSetFetcher" %>
<%@ page import="mpteam.tasks.DurationCalculator" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.StringTokenizer" %>
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
    <link rel="stylesheet" href="assets/css/controls.css">
</head>
<body>

<%
    /*
    response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
    response.setHeader("Pragma","no-cache");
    response.setDateHeader("Expires",0);
    */
%>
<!-- Header Code -->
<header id="header">
    <h2 id="logo"><a href="index.jsp">JAI KISAAN WEB</a></h2>
    <nav id="nav">
        <ul>

            <!--
            Commented to block logging out redirection to home
            <li><a href="querform.jsp">Home</a></li>
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
                    System.out.println(mailobject);
                    System.out.println(firstname);
                    System.out.println(secondname);
                    if (mailobject != null) {
                        out.println("Logged In Mail: " + mailobject.toString());
                    } else {
                        response.sendRedirect("index.html");
                    }

                %>
            </a></li>
            <li><a href="#" class="button special"><%
                if (firstname == null && secondname == null)
                    response.sendRedirect("querform.jsp");
                else if (firstname != null && secondname != null)
                    out.println("Hello " + firstname.toString() + " " + secondname.toString());
            %></a></li>
            <li><a href="logout.jsp" class="button special">Logout</a></li>
            <li><a href="experts-page/querform.jsp" class="button special">Ask an Expert</a></li>
            <li><a href="answeredqueries.jsp" class="button special">See Answered Queries</a></li>

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
    out.println("<br>");
    out.println("Stage:");
    String stage = DurationCalculator.getGrowthStatus(gqlResultSetFetcher.getSowingTimeFromEmail(mailobject.toString()));
    out.println(stage);
%>
</p>

<p style="border: thin;border-style: solid;">
    Location: <%
    out.println(gqlResultSetFetcher.getLocationFromEmail(mailobject.toString()));
%>
</p>
<br>
<br>

<div align="center">

    <!-- <img src="cropimages/<% //out.println(crop+"/"+stage+".jpg");%>" alt="image" width="300" height="300"
         style="border: solid thick aqua;border-radius: 20px">
    <br>-->
    <!--<p align="center">A pest on <% //out.println(crop); %>at <% //out.println(stage); %> stage</p>
    <br><br>-->
    Current Stage
    <%
        ArrayList<String> pestList = new ArrayList<String>();
        ArrayList<String> pesticideList = new ArrayList<String>();
        ArrayList<String> doseList = new ArrayList<String>();
        String pest = gqlResultSetFetcher.getPestFromCrop(stage.trim(), crop.trim());
        StringTokenizer pestTokenizer = new StringTokenizer(pest, ",");
        while (pestTokenizer.hasMoreTokens()) {
            pestList.add(pestTokenizer.nextToken());
        }
        String pesticide = gqlResultSetFetcher.getPesticideFromCrop(stage.trim(), crop.trim());
        pestTokenizer = new StringTokenizer(pesticide, ",");
        while (pestTokenizer.hasMoreTokens()) {
            pesticideList.add(pestTokenizer.nextToken());
        }
        String pesticideDose = gqlResultSetFetcher.getPesticideDoseFromCrop(stage.trim(), crop.trim());
        pestTokenizer = new StringTokenizer(pesticideDose);
        while (pestTokenizer.hasMoreTokens()) {
            doseList.add(pestTokenizer.nextToken());
        }
    %>
    <!--<table class="alt">
        <tr>
            <td><b>Pest</b></td>
            <td><b>Pesticide</b></td>
            <td><b>Dose</b></td>
        </tr>
         <%
            /* for (int i = 0; i < pestList.size(); i++) {
                out.println("<tr>");
                out.println("<td>");
                out.println(pestList.get(i));
                out.println("</td>");
                out.println("<td>");
                if (pesticideList.get(i) != null)
                    out.println(pesticideList.get(i));
                else
                    out.println("NA");
                out.println("</td");
                out.println("<td>");
                if (doseList.get(i)!=null)
                    out.println(doseList.get(i));
                else
                    out.println("NA");
                out.println("</td>");
                out.println("</tr>");
            }
            */
        %>

    </table> -->
    <table class="alt">

        <tr>
            <td>Stage</td>
            <td><% out.println(stage); %></td>
        </tr>
        <tr>
            <td>
                Pest
            </td>
            <td>
                <%
                    //String link;
                    out.println(gqlResultSetFetcher.getPestFromCrop(stage.trim(), crop.trim()));
                    /*for(int i=0;i<pestList.size();i++)
                    {
                        CharSequence sequence = "ph";
                        if(pestList.get(i).contains(sequence)) {
                            link = "/cropimages/thrips.jpg";
                            out.println("<a href='"+link+"'>"+pestList.get(i)+"</a>");
                        }
                        sequence = "mite";
                        if(pestList.get(i).contains(sequence)) {
                            link = "/cropimages/mites.jpg";
                            out.println("<a href='"+link+"'>"+pestList.get(i)+"</a>");
                        }
                        sequence="caterpi";
                        if(pestList.get(i).contains(sequence)) {
                            link = "/cropimages/caterpillar.jpg";
                            out.println("<a href='"+link+"'>"+pestList.get(i)+"</a>");
                        }
                        sequence ="leaf";
                        if(pestList.get(i).contains(sequence)) {
                            link = "/cropimages/leafhopper.jpg";
                            out.println("<a href='"+link+"'>"+pestList.get(i)+"</a>");
                        }

                        sequence = "borer";
                        if(pestList.get(i).contains(sequence)) {
                            link = "/cropimages/cpodborer.jpg";
                            out.println("<a href='"+link+"'>"+pestList.get(i)+"</a>");
                        }

                        sequence = "cut";
                        if(pestList.get(i).contains(sequence)) {
                            link = "/cropimages/cutworms.jpg";
                            out.println("<a href='"+link+"'>"+pestList.get(i)+"</a>");
                        }

                        sequence = "buck";
                        if(pestList.get(i).contains(sequence)) {
                            link = "/cropimages/buck.jpg";
                            out.println("<a href='"+link+"'>"+pestList.get(i)+"</a>");
                        }

                        sequence = "beet";
                        if(pestList.get(i).contains(sequence)) {
                            link = "/cropimages/barmy.jpg";
                            out.println("<a href='"+link+"'>"+pestList.get(i)+"</a>");
                        }
                    }*/

                %>
            </td>
        </tr>
        <tr>
            <td>
                Pesticide
            </td>
            <td>
                <%
                    out.println(gqlResultSetFetcher.getPesticideFromCrop(stage.trim(), crop.trim()));
                %>
            </td>
        </tr>
        <tr>
            <td>
                Pesticide Doses
            </td>
            <td>
                <%
                    out.println(gqlResultSetFetcher.getPesticideDoseFromCrop(stage.trim(), crop.trim()));
                %>
            </td>
        </tr>
    </table>
    <br>

    <div align="center">
        <a href="cropimages/<% out.println(crop+".htm");%>" class="special button">See Pest Images</a>
    </div>
    <br>
    <!--All Stages
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
                <% //out.println(gqlResultSetFetcher.getPest1FomCrop(crop.trim())); %>
            </td>
            <td>
                <%
                    //out.println(gqlResultSetFetcher.getPesticide1FomCrop(crop.trim()));
                %>
            </td>
            <td>
                <% //out.println(gqlResultSetFetcher.getPesticidedose1FromCrop(crop.trim())); %>
            </td>
        </tr>
        <tr>
            <td>
                <% //out.println(gqlResultSetFetcher.getPest2FomCrop(crop.trim())); %>
            </td>
            <td>
                <%
                    //out.println(gqlResultSetFetcher.getPesticide2FomCrop(crop.trim()));
                %>
            </td>
            <td>
                <% //out.println(gqlResultSetFetcher.getPesticidedose2FromCrop(crop.trim())); %>
            </td>
        </tr>
        <tr>
            <td>
                <% //out.println(gqlResultSetFetcher.getPest3FomCrop(crop.trim())); %>
            </td>
            <td>
                <%
                    //out.println(gqlResultSetFetcher.getPesticide3FomCrop(crop.trim()));
                %>
            </td>
            <td>
                <% //out.println(gqlResultSetFetcher.getPesticidedose3FromCrop(crop.trim())); %>
            </td>
        </tr>
    </table>
    -->
</div>
<div align="center">
    <a href="infopages/NR<% out.println(crop+".htm");%>" class="special button">Natural Remedies</a>
</div>
<br>
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
<script src="assets/js/modaldialog.js"></script>
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
