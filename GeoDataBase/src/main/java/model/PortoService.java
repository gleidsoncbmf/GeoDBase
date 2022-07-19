package model;
import util.JPAUtil;
import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.WKTReader;

public class PortoService {
     public List<Porto> listarPortos(String estado){
     
        List<Porto> result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();       

        Query query = em.createQuery("select mb from Porto mb where mb.nome_uf = :nome_uf");
        query.setParameter("nome_uf", estado);
        result = query.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return result;
    }
     
      public double distanciaentreporto(String portoA, String portoB){
        double result = 0;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();       

        Query query = em.createQuery("select distance(geography(aa.geometria), geography(ab.geometria)) from Porto aa, Porto ab where aa.municipio = :portoA  and   ab.municipio = :portoB");
        query.setParameter("portoA", portoA);
        query.setParameter("portoB", portoB);

        result = (double)query.getSingleResult();
        
        em.getTransaction().commit();
        em.close();
        
        return result;
    }
     
     
          
     
}
     