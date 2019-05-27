import modeles.Film;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class FilmDAO {
    @PersistenceContext
    EntityManager em;

    public FilmDAO() {
    }

    public List<Film> findAll(){
        String queryString = "SELECT f FROM Film AS f";
        List<Film> returnValue =  em.createQuery(queryString).getResultList();
        return returnValue;
    }

    public Film addFilm(Film f){
        em.persist(f);
        return f;
    }

}
