package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "ferrovias_2014")
public class Ferrovia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "objectid")
    private String objectid;
    @Column(name = "ferrovia")
    private String ferrovia;
    @Column(name = "operadora")
    private String operadora;
    @Column(name = "codpvnsimp")
    private String codpvnsimp; 
    @Column(name = "cod_pnv")
    private String cod_pvn;
    @Column(name = "geom")
    private Geometry geometria;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getObjectid() {
        return objectid;
    }

    public void setObjectid(String objectid) {
        this.objectid = objectid;
    }

    public String getFerrovia() {
        return ferrovia;
    }

    public void setFerrovia(String ferrovia) {
        this.ferrovia = ferrovia;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getCodpvnsimp() {
        return codpvnsimp;
    }

    public void setCodpvnsimp(String codpvnsimp) {
        this.codpvnsimp = codpvnsimp;
    }

    public String getCod_pvn() {
        return cod_pvn;
    }

    public void setCod_pvn(String cod_pvn) {
        this.cod_pvn = cod_pvn;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "Ferrovia{" + "gid=" + gid + ", objectid=" + objectid + ", ferrovia=" + ferrovia + ", operadora=" + operadora + ", codpvnsimp=" + codpvnsimp + ", cod_pvn=" + cod_pvn + ", geometria=" + geometria + '}';
    }
    
    

   
}
