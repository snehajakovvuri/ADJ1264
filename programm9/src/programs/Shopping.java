package programs;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShopServlet
 */
@WebServlet("/Shopping")
public class Shopping extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Shopping() {
        super();
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String book1cost = request.getParameter("book1cost");
		String book2cost = request.getParameter("book2cost");
		String book3cost = request.getParameter("book3cost");
		String book4cost = request.getParameter("book4cost");
		
		String book1 = request.getParameter("book1");
		String book2 = request.getParameter("book2");
		String book3 = request.getParameter("book3");
		String book4 = request.getParameter("book4");
		
		int amountBook1 = 0, amountBook2 = 0, amountBook3 = 0, amountBook4 = 0;
		
		HttpSession session = request.getSession(true);
		
		if(book1 != null && !book1.equals("")) {
			amountBook1 = Integer.parseInt(book1cost) * Integer.parseInt(book1);
			if(session.getAttribute("amountBook1") != null) {
				amountBook1 = amountBook1 + Integer.parseInt(session.getAttribute("amountBook1").toString());
			}
			
			session.setAttribute("amountBook1", amountBook1+"");
		}
		if(book2 != null && !book2.equals("")) {
			amountBook2 = Integer.parseInt(book2cost) * Integer.parseInt(book2);
			if(session.getAttribute("amountBook2") != null) {
				amountBook2 = amountBook2 + Integer.parseInt(session.getAttribute("amountBook2").toString());
			}
			session.setAttribute("amountBook2", amountBook2+"");
		}
		if(book3 != null && !book3.equals("")) {
			amountBook3 = Integer.parseInt(book3cost) * Integer.parseInt(book3);
			if(session.getAttribute("amountBook3") != null) {
				amountBook3 = amountBook3 + Integer.parseInt(session.getAttribute("amountBook3").toString());
			}
			session.setAttribute("amountBook3", amountBook3+"");
		}
		if(book4 != null && !book4.equals("")) {
			amountBook4 = Integer.parseInt(book4cost) * Integer.parseInt(book4);
			if(session.getAttribute("amountBook4") != null) {
				amountBook4 = amountBook4 + Integer.parseInt(session.getAttribute("amountBook4").toString());
			}
			session.setAttribute("amountBook4", amountBook4+"");
		}	
		
		response.sendRedirect("./buyBooks.html");
		
	}
		

}