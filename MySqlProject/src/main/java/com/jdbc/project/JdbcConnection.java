package com.jdbc.project;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JdbcConnection
 */
@WebServlet("/JdbcConnection")
public class JdbcConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

    /**
     * Default constructor. 
     */
    public JdbcConnection() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String Name = request.getParameter("name");
		String Email = request.getParameter("email");
		String Phone = request.getParameter("phone");
		
		Member member =new Member();
        member.setName(Name);
		member.setEmail(Email );
		member.setPhone(Phone);
		ConnectionJdbc cJdbc = new 	ConnectionJdbc();
		String jdbc = cJdbc.save(member);
		response.getWriter().print(jdbc);
	}
	

}
