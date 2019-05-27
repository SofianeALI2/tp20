import modeles.Livres;
import modeles.Musique;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class LivresDAO {

    @PersistenceContext
    EntityManager em;

    public List<Livres> findAll(){
        String queryString = "SELECT l FROM Livres AS l";
        List<Livres> returnValue =  em.createQuery(queryString).getResultList();
        return returnValue;
    }

    public  Livres addLivres(Livres l){
        em.persist(l);
        return l;
    }
    public void deleteMusicById(int id){
        em.createQuery("DELETE FROM Livres l where l.id =" +id).executeUpdate();
    }

    public LivresDAO() {
    }

    public Livres findbyId(int id){
        String queryString = "SELECT l FROM Livres AS l WHERE l.id = "+id;
        Livres l = (Livres) em.createQuery(queryString).getResultList().get(0);
        return l;

    }


}
