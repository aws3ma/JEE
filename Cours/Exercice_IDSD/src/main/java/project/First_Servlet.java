package project;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class First_Servlet
 */
@WebServlet("/First_Servlet")
public class First_Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public First_Servlet() {
    	super();
    	System.out.println("Création d'instance First servlet !!! ");
        
        // TODO Auto-generated constructor stub
    }
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	System.out.println("C'est doPost de First Servlet !!! ");
    	response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		String log= request.getParameter("login");
		String filiere= request.getParameter("fil");        
        if ( log == null ) log = "";
        if ( filiere == null ) filiere = "";
        out.append("Votre login est : ").append(log).append("<br>");
      	out.append("Votre filiere est : ").append(filiere).append("<br>");
      		
      	
      	HttpSession session = request.getSession(true);
      	
      	session.setAttribute( "login", log );
        session.setAttribute( "filiere", filiere );
        session.setAttribute("id", 142);
        
        request.getRequestDispatcher( "/CycleVie" ).forward( request, response );	
		//out.append("<b>Exercice_IDSD first servlet with IDSD; Served at: </b>").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
        
	}

}
