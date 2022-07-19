package model;
import util.JPAUtil;
import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.WKTReader;

public class EstadoService {
    
   public List<Estado> estadosbr(){
        List<Estado> result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();
        
        Query query = em.createQuery("select e from Estado e");
        //query.setParameter("sigla_uf", sigla_uf);
        result = query.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return result;
    }
   
    public List<Estado> listarestadosvizinhos(String nm_uf){
        List<Estado> result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();      
        Query query = em.createQuery("select eb from Estado ea, Estado eb where touches(ea.geometria, eb.geometria) = true and ea.nm_uf = :nm_uf");
        query.setParameter("nm_uf", nm_uf);
        result = query.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return result;
    }
    
    
   
    
}