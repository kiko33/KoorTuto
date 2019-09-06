package com.octest.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class Calculer
 */
@WebServlet(urlPatterns="/Calculer", loadOnStartup=1)
public class Calculer extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	double somme = 0;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculer() {
        super();
        
    }
    
    @Override
    public void init() throws ServletException {
    	super.init();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculat.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		double val1 = Double.parseDouble(request.getParameter("val1")) ;
		
		double val2 = Double.parseDouble(request.getParameter("val2"));
		
		
			
		String TypeOp = request.getParameter("operation");
		
		HttpSession session = request.getSession( true );
		session.setAttribute("Val1", val1);
		session.setAttribute("Val2", val2);
		session.setAttribute("TypeOperation", TypeOp);
		somme = (val1 + val2);
		
		
		System.out.println("la somme est: " + somme ); 
		
		doGet(request, response);
	}
	
	public double getSomme(double somme) {
		//somme = (val1 + val2);
		//afficher la somme
		System.out.println(somme);
		return somme;		
	}
	

}
