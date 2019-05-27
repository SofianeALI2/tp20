import modeles.Livres;
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

@WebServlet(name = "createLivresServlet" , urlPatterns = "/createLivresServlet")
public class createLivresServlet extends HttpServlet {
    @EJB
    LivresDAO LivresDAO;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Livres newLivres = new Livres(request.getParameter("TitreLivres"),request.getParameter("Artiste"),
                Integer.parseInt(request.getParameter("Pages")));
        LivresDAO.addLivres(newLivres);
        response.sendRedirect("listServlet");
    }
}
