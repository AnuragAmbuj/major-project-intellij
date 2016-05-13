<%--
  Created by  Anurag Ambuj
  Date: 4/18/2016
  Time: 6:52 AM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Data Entry portal</title>
    <script>
        function redirect(url) {
            window.location = "http://localhost:8888/admin/" + url;
        }
    </script>
</head>
<body>
<br>
<br>
<h1 align="center">Admin section</h1>
<div align="center" style="border:solid medium black">
    <p>
        Do an admin data entry for 3 pests:
        <button onclick="redirect('admindataentrypoint.jsp');">Enter Data</button>
    </p>
    <p>
        Do stage wise data entry for all pests:
        <button onclick="redirect('adminstagedataentry.jsp');">Enter Stagewise Pest Details</button>
    </p>

</div>

</body>
</html>
