package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customerdetails.models.CustomerDetails;

/**
 * Servlet implementation class SearchServlet
 */
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchServlet() {
		super();
}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = request.getParameter("id");

			try {
				if (CustomerDetails.checkCustomer(id) != null) {
					CustomerDetails cust = CustomerDetails.checkCustomer(id);
					request.setAttribute("customer", cust);
					request.getRequestDispatcher("viewCustomer.jsp").forward(request, response);
				}

				else {
					request.setAttribute("message", "No such ID is available.");
					request.getRequestDispatcher("error.jsp").forward(request, response);
				}
				
				doGet(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		
		
		
	}

}
