package fr.delmaire.patternmvc.produit.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.delmaire.patternmvc.produit.bean.Produit;
import fr.delmaire.patternmvc.produit.business.impl.ProduitBusiness;

/**
 * Servlet implementation class ProduitServlet
 */
@WebServlet("/produits")
public class ProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ProduitBusiness produitbusiness = new ProduitBusiness();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Produit>listeProduits = produitbusiness.getProduits();
		
		request.setAttribute("produits", listeProduits);
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/produit/produits.jsp")
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
