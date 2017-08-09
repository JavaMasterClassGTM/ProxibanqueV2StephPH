<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="metier.Client"%>
      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste clients</title>
</head>
<body>
<c:forEach items="${listecli}" var="element">
	Identifiant du conseiller : ${element.idCons}<br/>
	Identifiant du client: ${element.idClient}<br/>
	Prénom : ${element.prenom}<br/>
	Nom : ${element.nom}<br/>
	Adresse : ${element.adresseCompl}<br/>
	Téléphone : ${element.telephone}<br/>
	Email : ${element.email}<br/>
	<a href="voirCompte.jsp?value=${element.idClient}&valuep=${element.prenom}&valuen=${element.nom}">Formulaire compte pour id client</a>
	<br/>
	</c:forEach>
	
	
</body>
</html>