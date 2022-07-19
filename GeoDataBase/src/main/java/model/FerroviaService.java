package model;


import util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.WKTReader;

public class FerroviaService {
     
     public List<Ferrovia> listarFerrovia(){
        List<Ferrovia> result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();       

        Query query = em.createQuery("select fr from Ferrovia fr");//, Alert.class);
        //query.setParameter("nome", nome);
        result = query.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return result;
    }
     
      public List<Ferrovia> ferroviacortaslz(String nome){
     
        List<Ferrovia> result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();    
        
        Query query = em.createQuery("select f from Ferrovia f, Municipio m where crosses(f.geometria, m.geometria)= true and m.nome = :nome");
        query.setParameter("nome", nome);
        result = query.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return result;
    }
      
     public List<Ferrovia> listaroperadora(String operadora){
        List<Ferrovia> result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();       

        Query query = em.createQuery("select ds from Ferrovia ds where ds.operadora = :operadora");
        query.setParameter("operadora", operadora);
        result = query.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return result;
    }

}
    
