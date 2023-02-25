package project;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CycleVie
 */
//@WebServlet("/CycleVie")
@WebServlet( urlPatterns="/CycleVie", loadOnStartup=1)
public class CycleVie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CycleVie() {
        super();
        System.out.println("Création d'instance cycle de vie !!! ");
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	System.out.println("C'est la méthode init !!! ");
    	String dburl = this.getServletContext().getInitParameter("DataBase_URL");
    	System.out.println("getInitParameter : " + dburl);
    }
    
    /*@Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	super.service(req, res);
    }*/
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("C'est la méthode doGet !!! ");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();     
		response.getWriter().println("verification de la première session : "+session);
        String filiere = (String) session.getAttribute("filiere");
        String log = (String) session.getAttribute("login");
        int id = (int) session.getAttribute("id");
        response.getWriter().append("Page CycleVie : Votre login est :").append(log).append("<br>");
        response.getWriter().append("Page CycleVie : Votre filiere est : ").append(filiere).append("<br>");
        response.getWriter().append("Page CycleVie : Votre id est : ");
        response.getWriter().println(id);
        response.getWriter().append("<br>");
        //session.invalidate();
        HttpSession session2 = request.getSession(false);
        response.getWriter().println("verification de la deuxième session : "+session2);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("C'est la méthode destroy !!! ");
		super.destroy();
	}

}
