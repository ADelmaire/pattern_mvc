package fr.delmaire.patternmvc.utilisateur.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.delmaire.patternmvc.utilisateur.bean.User;
import fr.delmaire.patternmvc.utilisateur.business.impl.UtilisateurBusiness;

/**
 * Servlet implementation class UtilisateursServlet
 */
@WebServlet("/utilisateurs")
public class UtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       UtilisateurBusiness utilisateurbz = new UtilisateurBusiness();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UtilisateurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<User> listeUtilisateurs = utilisateurbz.getUsers();
		
		request.setAttribute("users", listeUtilisateurs);
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/utilisateur/utilisateurs.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
