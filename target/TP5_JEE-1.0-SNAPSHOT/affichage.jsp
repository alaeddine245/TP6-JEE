<%-- 
    Document   : affichage.jsp
    Created on : Nov 18, 2021, 2:01:05 PM
    Author     : Alaeddine
--%>

<%@page import="java.util.Vector"%>
<%@page import="com.app.metier.Utilisateur"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Affichage</title>
    </head>
    <body>
        <% 
          Vector<Utilisateur> users = (Vector<Utilisateur>) request.getAttribute("users");
            for(Utilisateur user: users) {
           %>
        
        <p>Id User: <%=user.getIdUser() %></p>
        <p>Login: <%=user.getLogin() %></p>
        <p>Pass: <%=user.getPass() %></p>
        <p>Email: <%=user.getEmail() %></p>
        <p>Ville: <%=user.getVille() %></p>
       <a href="http://localhost:8080/TP5_JEE/ServletSupp?id=<%=user.getIdUser() %>">Supprimer</a> <br>
        <% } %>
    </body>
</html>
