import modeles.Musique;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "listServlet" ,urlPatterns="/listServlet")
public class listServlet extends HttpServlet {
    @EJB
    MusiqueDAO musiqueDAO;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Musique> musicList = musiqueDAO.findAll();
        request.setAttribute("musiqueList",musicList);
        RequestDispatcher dp = request.getRequestDispatcher("list.jsp");
        dp.forward(request,response);
    }
}
