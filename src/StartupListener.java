import modeles.Film;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class StartupListener implements ServletContextListener {


    @EJB
    FilmDAO filmDAO;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("STARTING");
        Film f = new Film("NoM",2002,"Realisateur");
        System.out.println(f);
        filmDAO.addFilm(f);


    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
