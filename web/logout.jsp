<%@ page import="java.util.Enumeration" %><%--
  Created by  Anurag Ambuj
  Date: 2/23/2016
  Time: 10:25 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
    HttpSession httpSession = request.getSession(true);
    Enumeration<String> enumeration = httpSession.getAttributeNames();
    while (enumeration.hasMoreElements()) {
        httpSession.removeAttribute(enumeration.nextElement());
    }
    httpSession.invalidate();
    response.sendRedirect("index.jsp");
%>
</body>
</html>
