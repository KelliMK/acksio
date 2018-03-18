package edu.ycp.cs320.acksio.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.ycp.cs320.acksio.model.UserAccount;

// servlet for the UserAccount class login page
// this servlet and UserAccount.login() based directly on http://met.guc.edu.eg/OnlineTutorials/JSP%20-%20Servlets/Full%20Login%20Example.aspx

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		System.out.println("Login Servlet: doGet");
		
		/*
		// holds the error message text, if there is any
		String errorMessage = null;
		
		// creates a new UserAccount model with username, password from data
		UserAccount model = new UserAccount(req.getParameter("username"), req.getParameter("password"));
		
		// Add parameters as request attributes
		req.setAttribute("model", model);
		
		// add result objects as attributes
		// this adds the errorMessage text and the result to the response
		req.setAttribute("errorMessage", errorMessage);
		*/
		
		// call JSP to generate empty form
		req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) //TODO: Implement 
			throws ServletException, IOException {
		
		System.out.println("Login Servlet: doPost");

		// holds the error message text, if there is any
		String errorMessage = null;
		
		// create the UserAccount model for form input
		UserAccount model = new UserAccount(req.getParameter("username"), req.getParameter("password"));
		
		System.out.println(model.getUsername() + " " + model.getPassword());
		
		try {
			// test the input for validity in database
			model.login();
			
			System.out.println(model.getValidity());
			
			// if user inputs correct login info, move to page corresponding to user type
			// else, inform the user of their error
			// TODO: refactor UserAccount for user type, currently redirects to dispatcher.jsp only
			if(model.getValidity()) {
				HttpSession session = req.getSession(true);	    
		        session.setAttribute("currentSessionUser", model); 
				
				resp.sendRedirect("dispatcher");
			} else {
				errorMessage = "Please input a valid user name and password.";
			}
		} catch(IOException e) {
			errorMessage = "Exception";
		}
		
		/*
		if(!model.getValidity()) {
			errorMessage = "NA";
		}
		*/
		
		// Add parameters as request attributes
		req.setAttribute("model", model);
		
		// add result objects as attributes
		// this adds the errorMessage text and the result to the response
		req.setAttribute("errorMessage", errorMessage);
		
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
	}
}