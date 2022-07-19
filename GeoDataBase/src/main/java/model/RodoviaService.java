/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import util.JPAUtil;
import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.WKTReader;

public class RodoviaService {
     public List<Rodovia> rodoviaint(String nome_regia){
        List<Rodovia> result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();    
        
        Query query = em.createQuery("select r from Rodovia r, Estado e where intersects(r.geometria, e.geometria)= true and r.nome_regia = :nome_regia");
        query.setParameter("nome_regia", nome_regia);
        result = query.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return result;
    }
     

}
