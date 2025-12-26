package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import dao.NoteDAO;

@WebServlet("/deleteNote")
public class DeleteNoteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DeleteNoteServlet() {
        super();
    }

    // ✅ DELETE NOTE USING GET (from link)
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 1. Get session
        HttpSession session = request.getSession(false);

        // 2. Check login
        if (session == null || session.getAttribute("userId") == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        // 3. Get note id
        int noteId = Integer.parseInt(request.getParameter("id"));

        // 4. Delete note
        NoteDAO.deleteNote(noteId);

        // 5. Redirect to dashboard
        response.sendRedirect("dashboard.jsp");
    }

    // Optional: block POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("dashboard.jsp");
    }
}
