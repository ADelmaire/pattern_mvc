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
 * Servlet implementation class ProduitInfos
 */
@WebServlet("/produit-info")
public class ProduitInfosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProduitBusiness produitbz = new ProduitBusiness();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProduitInfosServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String iString = request.getParameter("i");
		int i = Integer.parseInt(iString);

		ArrayList<Produit>produits = produitbz.getProduits();
		
		Produit p = produits.get(i);

		request.setAttribute("prod", p);

		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/produit/produit-infos.jsp")
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
