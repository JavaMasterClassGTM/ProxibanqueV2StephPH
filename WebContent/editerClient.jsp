<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="bootstrap.min.css">
<title>Editer un client</title>
</head>
<body>

	Identifiant du client: ${client.idClient}<br/>
	Prénom : ${client.prenom}<br/>
	Nom : ${client.nom}<br/>
	Adresse : ${client.adresseCompl}<br/>
	Email : ${client.email}<br/>
	<br/>
	
<div>
<h2>Est-ce bien le client que vous voulez modifier ?</h2>
</div>

<div>
<form class="form-horizontal" method="post" action="ServletEditerClient">
	
	<div class="form-group">
		<label for="log1" class="col-sm-2 control-label">Id client :</label>
		<div class="col-sm-2">
		<input type="text" class="form-control" id="log1" name="idClient" value="${client.idClient}" readonly/>
		</div>
	</div>
	
	<div class="form-group">
		<label for="log1" class="col-sm-2 control-label">Nom :</label>
		<div class="col-sm-2">
		<input type="text" class="form-control" id="log1" name="nomuser" placeholder="Nom"/>
		</div>
	</div>
	
	<div class="form-group">
		<label for="pn1" class="col-sm-2 control-label">Prénom :</label>
		<div class="col-sm-2">
		<input type="text" class="form-control" id="pn1" name="prenomuser" placeholder="Prénom"/>
		</div>
	</div>
	
	<div class="form-group">
		<label for="adr1" class="col-sm-2 control-label">Adresse :</label>
		<div class="col-sm-2">
		<input type="text" class="form-control" id="adr1" name="adresseuser" placeholder="adresse code postal ville"/>
		</div>
	</div>
	<div class="form-group">
		<label for="ema1" class="col-sm-2 control-label">Email :</label>
		<div class="col-sm-2">
		<input type="text" class="form-control" id="ema1" name="emailuser" placeholder="email"/>
		</div>
	</div>
	
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
		<button type="submit" class="btn btn-default">Envoyer</button>
		<button type="reset" class="btn btn-default">Annuler</button>
		</div>
	</div>
	</form>
</div>
</body>
</html>