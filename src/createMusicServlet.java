import modeles.Musique;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.transaction.UserTransaction;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "createMusicServlet" , urlPatterns = "/createMusicServlet")
public class createMusicServlet extends HttpServlet {
    @EJB
    MusiqueDAO musiqueDAO;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Musique newMusique = new Musique(request.getParameter("TitreMusique"),request.getParameter("Artiste"),
                Integer.parseInt(request.getParameter("Duree")));
        musiqueDAO.addMusique(newMusique);
        response.sendRedirect("listServlet");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
