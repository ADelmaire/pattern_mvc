package fr.delmaire.patternmvc.produit.business.impl;

import java.util.ArrayList;

import fr.delmaire.patternmvc.produit.bean.Produit;
import fr.delmaire.patternmvc.produit.business.IProduitBusiness;

public class ProduitBusiness implements IProduitBusiness{

	@Override
	public ArrayList<Produit> getProduits() {
		Produit axe = new Produit
				("Axe", 3.50, "ressources/images/produit/axe.jpg", "https://www.unilever.com/brands/personal-care/axe.html");
		Produit cafe = new Produit("Café", 3.25, "ressources/images/produit/cafe.jpg", "https://www.meo.fr/");
		Produit eau = new Produit("Cristaline", 1.20, "ressources/images/produit/cristaline.jpg", "https://www.moneaucristaline.fr/");
		Produit spec = new Produit("Speculoos", 2.40, "ressources/images/produit/speculoos.jpg", "https://maisondandoy.com/fr/speculoos");
		Produit choco = new Produit("Côte d'or", 2.20, "ressources/images/produit/choco.jpg", "https://fr.cotedor.be/");
		Produit chaussettes = new Produit("Chaussettes", 5.50, "ressources/images/produit/chaussettes.jpg", "https://www.dim.fr/c/chaussettes-femme-16000/");
		
		ArrayList<Produit> listeProd = new ArrayList<Produit>();
		
		listeProd.add(axe);
		listeProd.add(cafe);
		listeProd.add(eau);
		listeProd.add(spec);
		listeProd.add(choco);
		listeProd.add(chaussettes);
		
		
		return listeProd	;
	}

}
