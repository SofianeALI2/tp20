import modeles.Musique;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "deleteServlet" , urlPatterns = "/deleteServlet")

public class deleteServlet extends HttpServlet {
    @EJB
    MusiqueDAO musiqueDAO;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        musiqueDAO.deleteMusicById(Integer.parseInt(request.getParameter("delete")));
        response.sendRedirect("listServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("GET");
        response.getWriter().println(request.getParameter("delete"));

    }
}
