package net.java.registration.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.java.registration.dao.emp_infodao;
import net.java.registration.model.emp_info;
import java.io.IOException;
/**
 * Servlet implementation class emp_infoServlet
 */
@WebServlet("/register")
public class emp_infoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;  
	private emp_infodao emp_infodao = new emp_infodao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public emp_infoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Views/emp_inforegister.jsp");
		dispatcher.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");
		
		emp_info emp_info =new emp_info();
		emp_info.setFirstname(firstname);
		emp_info.setLastname(lastname);
		emp_info.setUsername(username);
		emp_info.setPassword(password);
		emp_info.setAddress(address);
		emp_info.setContact(contact);
		
		try {
			emp_infodao.registerEmployee(emp_info);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/emp_infodetails.jsp");
		dispatcher.forward(request, response);
	}

}
