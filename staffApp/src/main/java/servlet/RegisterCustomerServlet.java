package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customerdetails.models.CustomerDetails;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String address = request.getParameter("address");

		try {
			if (new CustomerDetails(id, name, address).addCustomer()) {
				request.setAttribute("message", "successfully created!!");
				request.getRequestDispatcher("message.jsp").forward(request, response);
			} else {
				request.setAttribute("message", "Something went !!unable to register");
				request.getRequestDispatcher("error.jsp").forward(request, response);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 

	}

}
