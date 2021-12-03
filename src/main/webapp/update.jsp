<%-- 
    Document   : update.jsp
    Created on : Nov 18, 2021, 3:12:47 PM
    Author     : Alaeddine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<form action="ServletUpdate" method="get">
        <label for="id">ID:</label><br>
        <input type="text" id="fid" name="id"><br>
        <label for="email">Email:</label><br>
        <input type="text" id="femail" name="email"><br>
        <label for="email">Ville:</label><br>
        <input type="text" id="fville" name="ville"><br>
        <label for="login">Login:</label><br>
        <input type="text" id="flogin" name="login"><br>
        <label for="pass">Pass: </label><br>
        <input type="password" id="fpass" name="pass"><br>
        <input type="submit" value="Update">
</form>
    </body>
</html>
