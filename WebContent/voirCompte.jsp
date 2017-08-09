<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<h2>Est-ce bien le client que vous voulez modifier ?</h2>
</div>

<div>
<form class="form-horizontal" method="post" action="ServletVoirCompte">
	
	<div class="form-group">
		<label for="log1" class="col-sm-2 control-label">Id client :</label>
		<div class="col-sm-2">
		<input type="text" class="form-control" id="log1" name="idClient" value=<%= request.getParameter("value") %> readonly/>
		</div>
	</div>
	
	<div class="form-group">
		<label for="log1" class="col-sm-2 control-label">Nom :</label>
		<div class="col-sm-2">
		<input type="text" class="form-control" id="log1" name="nomuser" placeholder=<%= request.getParameter("valuen") %> readonly/>
		</div>
	</div>
	
	<div class="form-group">
		<label for="pn1" class="col-sm-2 control-label">Prénom :</label>
		<div class="col-sm-2">
		<input type="text" class="form-control" id="pn1" name="prenomuser" placeholder=<%= request.getParameter("valuep") %> readonly/>
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