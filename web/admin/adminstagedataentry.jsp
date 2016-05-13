<%--
  Created by  Anurag Ambuj
  Date: 3/21/2016
  Time: 5:27 AM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
        Stagewise and Cropwise Data Entry
    </title>
</head>
<body>
<h1 align="center">
    Stagewise and Cropwise Data Entry
</h1>
<div align="left">
    <%
        Object status = request.getAttribute("status");
        if (status == null) {

        } else {
            out.println("<p style='color:blue'>" + status + "</p>");
        }
    %>
    <form action="/servregdatahandler" method="post">
        <table>
            <tr>
                <td>
                    Select Stage:
                </td>
                <td>
                    <select name="stage">
                        <option value="Germination">Germination</option>
                        <option value="Adult">Adult</option>
                        <option value="Flowering">Flowering</option>
                        <option value="Fruit">Fruit</option>
                    </select>
                    <br>
                </td>
            </tr>
            <tr>
                <td>
                    Select Crop:
                </td>
                <td>
                    <select name="crop">
                        <option value="Tomato">Tomato</option>
                        <option value="Chilli">Chilli</option>
                        <option value="Potato">Potato</option>
                    </select>
                    <br>
                </td>
            </tr>
            <tr>
                <td>Input Pests affecting</td>
                <td><textarea name="pests" placeholder="Pest Data Here" rows="5" cols="100"></textarea></td>
                <br>
            </tr>
            <tr>
                <td>
                    Input Related Pesticides
                </td>

                <td><textarea name="pesticides" placeholder="Pesticide Data Here" rows="5" cols="100"></textarea></td>
                <br>
            </tr>
            <tr>
                <td>Input Related Pesticide Doses</td>
                <td><textarea name="pdoses" placeholder="Pesticide Doses Data Here" rows="5" cols="100"></textarea>
                    <br>
                </td>
            </tr>
        </table>
        <button type="submit">Submit</button>
        &nbsp;
        <button type="reset">Reset</button>
    </form>
</div>
</body>
</html>
