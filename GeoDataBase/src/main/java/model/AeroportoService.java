package model;
import util.JPAUtil;
import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.WKTReader;

public class AeroportoService {
    
     public List<Aeroporto> aeroportosint(String nome_regia){
        List<Aeroporto> result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();    
        
        Query query = em.createQuery("select a from Aeroporto a, Estado e where intersects(a.geometria, e.geometria)= true and a.nome_regia = :nome_regia");
        query.setParameter("nome_regia", nome_regia);
        result = query.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return result;
    }
  
    
}