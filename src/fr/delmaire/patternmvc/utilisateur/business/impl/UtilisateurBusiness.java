package fr.delmaire.patternmvc.utilisateur.business.impl;

import java.util.ArrayList;

import fr.delmaire.patternmvc.utilisateur.bean.User;
import fr.delmaire.patternmvc.utilisateur.business.IUtilisateurBusiness;

public class UtilisateurBusiness implements IUtilisateurBusiness{

	@Override
	public ArrayList<User> getUsers() {

		String dossierImages = "ressources/images/utilisateur/";

		User pl = new User("Lapin", "Pierre", dossierImages + "peter.jpg", 2);
		User miffy = new User("Lapin", "Miffy", dossierImages + "miffy.jpg", 35);
		User bob = new User("Sponge", "Bob", dossierImages + "bob.jpg", 12);
		User gc = new User("Slump", "Gatchan", dossierImages + "gatchan.jpg", 120);
		User gz = new User("Go", "Zilla", dossierImages + "gozilla.jpg", 70);
		User arale = new User("Slump", "Arale", dossierImages + "arale.jpg", 4);
		User patrick = new User("Star", "Patrick", dossierImages + "patrick.jpg", 12);
		User slump = new User("Slump", "Asao", dossierImages + "slump.jpg", 38);

		ArrayList<User>users = new ArrayList<User>();

		users.add(pl);
		users.add(miffy);
		users.add(bob);
		users.add(gc);
		users.add(gz);
		users.add(arale);
		users.add(patrick);
		users.add(slump);

		return users;

	}

}
