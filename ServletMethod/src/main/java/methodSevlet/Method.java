package methodSevlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Method
 */
@WebServlet("/Method")
public class Method extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Method() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
       response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String configvalue=getServletConfig().getInitParameter("configname");
		
		PrintWriter pw = response.getWriter();
		pw.print("<p>config vallue </p>" + configvalue);
		String contextparam = getServletContext().getInitParameter("contextname");
		pw.print("<p>contextparam</p>" + contextparam);
		pw.print("method of Servlet");
		String useragent= request.getHeader("Accept");
		pw.print("<p>user agent </p>"+useragent);
		String method=request.getMethod();
		pw.print("method name </p>"+method);
		//response.setHeader("Refresh", "20:URL= index.jsp");
		//response.sendRedirect("index.jsp");
		//response.sendRedirect("index.jsp");
	}

//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}

	      
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
