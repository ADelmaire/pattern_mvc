<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Infos produit</title>
<link rel="stylesheet" href="ressources/css/produit/produit-infos.css" />
</head>
<body>

	<h2>Infos du produit</h2>
	<div id="conteneur">
		<h1>${prod.nom}</h1>
		<img src="${prod.lienImage}" />
		<h2 id="prix">${prod.prix }€</h2>
		<h4>
			<a href="${prod.lienSiteOff}">Site officiel</a>
		</h4>
	</div>
</body>
</html>