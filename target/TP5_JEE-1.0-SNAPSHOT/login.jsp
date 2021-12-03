<%-- 
    Document   : login.jsp
    Created on : Nov 17, 2021, 6:54:59 PM
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
        
        <% 
            boolean et;
            if(request.getAttribute("etat")!=null) { et=(boolean) request.getAttribute("etat"); }
        else{
            et=false;
        }
            if(et==true) {
            %><p>LOGIN INCORRECT!</p>
            <%}%>
        <P> Please fill out this form with your name.
            Thanks!
        <FORM METHOD="GET" action="ServletLogin">
            <P> Please enter your login and password:
            <P> login: <INPUT NAME="login" TYPE="TEXT" SIZE=" 12" MAXLENGTH=" 20">
            <P> password: <INPUT NAME="password" TYPE="password" SIZE=" 12" MAXLENGTH=" 20">
            <P> Thank you! <INPUT TYPE="SUBMIT">
        </FORM>
    </body>
</html>
