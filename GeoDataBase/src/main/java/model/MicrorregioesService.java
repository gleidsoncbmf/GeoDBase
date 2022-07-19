
package model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.WKTReader;
import util.JPAUtil;

public class MicrorregioesService {
    
    
    public List<Microrregioes> municipiosmicrorregiao(String sigla, String nome){
        List<Microrregioes> result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();
        
        Query query = em.createQuery("select a from Microrregioes a, Municipio b where a.sigla = :sigla and b.nome = :nome");
        query.setParameter("sigla", sigla);
        query.setParameter("nome", nome);
        result = query.getResultList();
        em.getTransaction().commit();
        em.close();
        
        
        return result;
    }
}
    