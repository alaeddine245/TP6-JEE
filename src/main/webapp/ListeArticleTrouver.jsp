<%@page import="com.app.metier.Article"%>
<%@ page language="java" contentType="text/html; charset=windows-1256"
pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste Article Trouvés</title>
</head>
<body>
<% Article article = (Article) request.getAttribute("article"); %>
<table border="1" width="80%">
<tr>
<th>code</th> <th>nom</th> <th>description</th> <th>quantite</th> <th>prix</th>  <th>ajouter panier</th> <th>supprimer</th> <th>modifier</th> 
</tr>

<tr>
<td>     <%= article.getCode() %> </td>
<td>    <%= article.getNom() %> </td>
<td>     <%= article.getDesc() %> </td>
<td>     <%= article.getQuant() %></td>
<td>    <%= article.getPrix() %></td>

<td>   <a href="/TP5_JEE/ServletAjout?code=<%= article.getCode() %>" > ajouter </a>  </td>
<td>   <a href="/TP5_JEE/SupprimerArticle?code=<%= article.getCode() %>" > supprimer </a>  </td>
<td>   <a href="/TP5_JEE/ModifierArticle?code=<%= article.getCode() %>&nom=<%= article.getNom() %>" > modifier </a>  </td>

</tr>

</body>
</html>