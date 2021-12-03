<%-- 
    Document   : Bienvenue.jsp
    Created on : Nov 17, 2021, 7:32:53 PM
    Author     : Alaeddine
--%>

<%@page import="com.app.metier.Utilisateur"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% HttpSession maSession = request.getSession(false);
            if(maSession!=null) {
           Utilisateur user= (Utilisateur) maSession.getAttribute("user"); %>
        <p>Id User: <%=user.getIdUser() %></p>
        <p>Login: <%=user.getLogin() %></p>
        <p>Pass: <%=user.getPass() %></p>
        <p>Email: <%=user.getEmail() %></p>
        <p>Ville: <%=user.getVille() %></p>
        <% } %>
        <br>
        <br>
        <a href="http://localhost:8080/TP5_JEE/ajout.jsp">Ajout</a> <br>
        <a href="http://localhost:8080/TP5_JEE/update.jsp">Update</a> <br>
        <a href="http://localhost:8080/TP5_JEE/ServletAffichage">Affichage</a>

    </body>
</html>
