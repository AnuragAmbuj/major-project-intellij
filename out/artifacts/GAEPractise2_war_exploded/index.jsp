<%--
  Created by Anurag Ambuj.
  Date: 11/24/2015
  Time: 2:37 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jai Kisaan Web</title>
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
<body class="landing">
<div id="page-wrapper">


    <!-- Header -->
    <header id="header">
        <h1 id="logo"><a href="index.jsp">JAI KISAAN WEB</a></h1>
        <nav id="nav">
            <ul>
                <li><a href="index.jsp">Home</a></li>
                <!--
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
                <li><a href="register.jsp" class="button special"><%
                    HttpSession session1=request.getSession(true);
                    if(session1.isNew())
                    {
                        out.println("Sign Up");
                    }
                    else
                    {
                        Object firstname=session1.getAttribute("firstname");
                        System.out.println(firstname);
                        Object lastname=session1.getAttribute("secondname");
                        System.out.println(lastname);
                        if(firstname!=null && lastname!=null)
                            out.println(firstname.toString()+" "+lastname.toString());
                    }
                %></a></li>
                <li><a href="login.jsp" class="button special"><%
                        if(session1.isNew())
                        {
                            out.println("Sign In");
                        }
                        else
                        {
                            out.println("Sign Out");
                        }

                %></a></li>
            </ul>
        </nav>
    </header>

    <!-- Banner -->
    <section id="banner">
        <div class="content">
            <header>
                <h2>JAI KISAAN</h2>

                <p>ONLINE PEST CONTROL NOTIFICATION PORTAL</p>
            </header>
            <span class="image"><img src="images/jaikisaan02.png" alt=""/></span>
        </div>
        <a href="#one" class="goto-next scrolly">Next</a>
    </section>
    <footer id="footer">
        <ul class="icons">
            <li><a href="https://github.com/AnuragAmbuj/major-project" class="icon alt fa-github"><span class="label">GitHub</span></a>
            </li>
            <li><a href="mailto:anuragambuj@gmail.com" class="icon alt fa-envelope"><span class="label">Email</span></a></li>
        </ul>
        <ul class="copyright">
            <li>&copy; Jai Kisaan Major Project</li>
            <li>UI/UX Provider: <a href="http://html5up.net">HTML5 UP</a></li>
        </ul>
    </footer>
</div>
<!-- JSP Script for loading data onto the datastore -->

<!-- Scripts -->
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
