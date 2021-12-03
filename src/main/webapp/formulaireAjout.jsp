<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form METHOD="POST" action="AjouterArticle">
<P>
<P> code: <INPUT name="code" type="text" size="12" MAXLENGTH=" 20">
<P> nom: <INPUT name="nom" type="text" size="12" MAXLENGTH="20">
<P> description: <INPUT name="description" type="text" size="12" MAXLENGTH="20">
<P> quantité: <INPUT name="quantite" type="text" size="12" MAXLENGTH="20">
<P> prix: <INPUT name="prix" type="text" size="12" MAXLENGTH="20">
<P> <INPUT type="submit" value="Ajouter">
</body>
</html>