package welcomeServlet ;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		HttpSession session= request.getSession();
		ArrayList<String> loginhistory= (ArrayList<String>)session.getAttribute("loginHistory");
		//geting username from login servlet page
		String username= (String) request.getAttribute("username");
		pw.println("<h2> Welcome "+username+" </h2>");
//		pw.println("<h2>login history</h2>");
		if(loginhistory!=null&& !loginhistory.isEmpty()) {
			pw.println("<ul>");
			for(String loginTime: loginhistory) {
				pw.println("<li> login time is : "+loginTime+"</li>");
				
			}
			pw.println("</ul>");
		}
		
		else {
			pw.println("<h2>no login history</h2>");
		}
		
//		response.getWriter().println("<input class='button' type='submit' href='LogoutServlet.java'/>");
		pw.println("<form action='LogoutServlet' method='post'>");
        pw.println("<input type='submit' value='Logout'>");
        pw.println("</form>");
		
		
	}

}
