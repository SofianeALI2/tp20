import modeles.Musique;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class MusiqueDAO {

    @PersistenceContext
    EntityManager em;

    public List<Musique> findAll(){
        String queryString = "SELECT m FROM Musique AS m";
        List<Musique> returnValue =  em.createQuery(queryString).getResultList();
        return returnValue;
    }

    public Musique addMusique(Musique m){
        em.persist(m);
        return m;
    }
    public void deleteMusicById(int id){
        em.createQuery("DELETE FROM Musique m where m.id =" +id).executeUpdate();
    }

    public MusiqueDAO() {
    }

    public Musique findbyId(int id){
        String queryString = "SELECT m FROM Musique AS m WHERE m.id = "+id;
        Musique m = (Musique) em.createQuery(queryString).getResultList().get(0);
        return m;

    }


}
