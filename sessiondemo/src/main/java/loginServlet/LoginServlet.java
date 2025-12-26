package loginServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // ✅ CORRECT LOGIN DETAILS
        if ("narendra@12.gmail.com".equals(username) && "123".equals(password)) {
        	LocalDateTime now= LocalDateTime.now();
        	DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
        	String currentLoginTime= now.format(formatter);

            HttpSession session = request.getSession();
            ArrayList<String>loginHistory= (ArrayList<String>)session.getAttribute("loginHistory");
            if(loginHistory==null) {
            	loginHistory= new ArrayList();
            }
            loginHistory.add(currentLoginTime);
            session.setAttribute("loginHistory", loginHistory);
            session.setAttribute("user", username);
            // 1 minute

            response.sendRedirect("WelcomeServlet");

        } else {
            request.setAttribute("error", "Invalid Login");
            request.getRequestDispatcher("index.jsp")
                   .forward(request, response);
        }
    }
}
