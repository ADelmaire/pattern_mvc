<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>infos utilisateur</title>
<link rel="stylesheet"
	href="ressources/css/utilisateur/utilisateur-infos.css"/>
</head>

<body>

	<h2>Infos de l'utilisateur</h2>

	<div id="conteneur">
		<h1>${user.nom} ${user.prenom}</h1>

		<img src="${user.urlImage}" />
		<h3 id="prix">${user.age}ans</h3>

	</div>
</body>
</html>