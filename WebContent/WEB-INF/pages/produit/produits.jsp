<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>produits</title>
<link rel="stylesheet" href="ressources/css/produit/produits.css" />
</head>
<body>

	<h1>Produits</h1>

	<div id="conteneur">
		<c:forEach items="${produits}" var="produit" varStatus="status">
			<div class="bloc_produit">
				<div class="prix">
					<label>${produit.prix}</label>
				</div>
				<a href="produit-info?i=${status.index}"> <img
					src="${produit.lienImage}" />
				</a>
				<div class="description">${produit.nom}</div>
			</div>
		</c:forEach>
	</div>

</body>
</html>