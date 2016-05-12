<%--
  Created by  Anurag Ambuj
  Date: 1/25/2016
  Time: 3:08 AM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Data Entry Point</title>
</head>
<body>
<h1 align="center"> Administrators Data Insertion Point </h1>
<br>
<br>
   <div align="center">
       <h3 style="color:#39c088">
           <%
               Object object=request.getAttribute("status");
               if(object==null)
               {

               }
               else
               {
                   out.println(object.toString());
               }
           %>
       </h3>
    <div align="center" style="width: 60%;border: solid;border-radius: 30px;border-width: thick">
        <br>
        <br>
        <form method="post" action="jaikisaan.services.ServletDataEntryHandler">
            <table>
                <tr>
                    <td>Name of Crop</td>
                    <td><select name="cropname">
                        <option value="Tomato">Tomato</option>
                        <option value="Chilli">Chilli</option>
                        <option value="Potato">Potato</option>

                    </select>
                    </td>
                </tr>
                <tr>
                    <td>
                        Pest1
                    </td>
                    <td>
                        <input type="text" name="pest1">
                    </td>
                </tr>
                <tr>
                    <td>
                        Pest2
                    </td>
                    <td>
                        <input type="text" name="pest2">
                    </td>
                </tr>
                <tr>
                    <td>
                        Pest3
                    </td>
                    <td>
                        <input type="text" name="pest3">
                    </td>
                </tr>
                <tr>
                    <td>
                        Pesticide1
                    </td>
                    <td>
                        <input type="text" name="pesticide1">
                    </td>
                </tr>
                <tr>
                    <td>
                        Pesticide2
                    </td>
                    <td>
                        <input type="text" name="pesticide2">
                    </td>
                </tr>
                <tr>
                    <td>
                        Pesticide3
                    </td>
                    <td>
                        <input type="text" name="pesticide3">
                    </td>
                </tr>
                <tr>
                    <td>
                        PesticideDose1
                    </td>
                    <td>
                        <input type="text" name="pesticidedose1">
                    </td>
                </tr>
                <tr>
                    <td>
                        PesticideDose2
                    </td>
                    <td>
                        <input type="text" name="pesticidedose2">
                    </td>
                </tr>
                <tr>
                    <td>
                        PesticideDose3
                    </td>
                    <td>
                        <input type="text" name="pesticidedose3">
                    </td>
                </tr>
            </table>
            <input type="submit" value="Insert into DataStore">
            <input type="reset" value="Clear">
        </form>
        <br>
        <br>
    </div>

   </div>
</body>
</html>
