package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.CreditMetierImp;
import metier.ICreditMetier;

/**
 * Servlet implementation class ControleurServlet
 */
@WebServlet (name="cs",urlPatterns= {"/calcul","/VueCredit","/vuecredit"})
public class ControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ICreditMetier metier = new CreditMetierImp();
	private CreditModel model;
       	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		model=new CreditModel();
		request.setAttribute("resultat", model);
		request.getRequestDispatcher("VueCredit.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double montant = Double.parseDouble( req.getParameter("montant"));
		int duree = Integer.parseInt( req.getParameter("duree"));
		double taux = Double.parseDouble( req.getParameter("taux"));
		double mensualite = metier.calculeMensu(montant, taux, duree);
		model = new CreditModel(montant,taux,mensualite,duree);
		req.setAttribute("resultat", model);
		req.getRequestDispatcher("VueCredit.jsp").forward(req, resp);
	}

}
