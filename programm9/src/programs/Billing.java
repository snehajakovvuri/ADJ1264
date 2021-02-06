package programs;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CartBill
 */
@WebServlet("/Billing")
public class Billing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Billing() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(true);
		
		int totamt = 0;
		Enumeration names = session.getAttributeNames();
		
		while(names.hasMoreElements()) {
			String name = names.nextElement().toString();
			String value = session.getAttribute(name).toString();
			totamt += Integer.parseInt(value);
		}
		
		String amountBook1 = "";
		String amountBook2 = "";
		String amountBook3="";
		String amountBook4 = "";
		if(session.getAttribute("amountBook1") != null) {
			amountBook1 = session.getAttribute("amountBook1").toString();
		}
		if(session.getAttribute("amountBook2") != null) {
			amountBook2 = session.getAttribute("amountBook2").toString();
		}
		if(session.getAttribute("amountBook3") != null) {
			amountBook3 = session.getAttribute("amountBook3").toString();
		}
		if(session.getAttribute("amountBook4") != null) {
			amountBook4 = session.getAttribute("amountBook4").toString();
		}
		
		out.println("<table border = 2 style = 'background-color:lightgray'>");
		out.println("<tr><td>Python:</td><td>" + amountBook1 + "</td></tr>");
		out.println("<tr><td>Angular:</td><td>" + amountBook2 + "</td></tr>");
		out.println("<tr><td>Hibernate:</td><td>" + amountBook3 + "</td></tr>");
		out.println("<tr><td>Java:</td><td>" + amountBook4 + "</td></tr>");
		out.println("<tr><td>Total amount:</td><td>" + totamt + "</td></tr>");
		out.println("</table>");
		session.invalidate();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
	}
}