<%@page import="com.app.metier.Article"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>modifier article</title>
</head>
<body>
    
    <% Article article = (Article) request.getAttribute("article"); %>
<form METHOD="POST" action="ModifierArticle">
<P>
<P> code: <INPUT name="code" type="text" size="12" MAXLENGTH=" 20" value="<%= article.getCode() %>">
<P> nom: <INPUT name="nom" type="text" size="12" MAXLENGTH="20" value="<%= article.getNom() %>">
<P> description: <INPUT name="description" type="text" size="12" MAXLENGTH="20" value="<%= article.getDesc() %>">
<P> quantité: <INPUT name="quantite" type="text" size="12" MAXLENGTH="20" value="<%= article.getQuant() %>">
<P> prix: <INPUT name="prix" type="text" size="12" MAXLENGTH="20" value="<%= article.getPrix() %>">
<P><INPUT type="submit" value="Modifier">
</body>
</html>