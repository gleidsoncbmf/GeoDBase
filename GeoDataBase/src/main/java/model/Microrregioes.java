package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "br_microrregioes_2021")
public class Microrregioes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    
    @Column (name = "cd_micro")
    private Integer cd_micro;
    
    @Column (name = "nm_micro")
    private String nm_micro;
    
    @Column (name = "sigla")
    private String sigla;
    
    @Column (name = "geom")
    private Geometry geometria;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getCd_micro() {
        return cd_micro;
    }

    public void setCd_micro(Integer cd_micro) {
        this.cd_micro = cd_micro;
    }

    public String getNm_micro() {
        return nm_micro;
    }

    public void setNm_micro(String nm_micro) {
        this.nm_micro = nm_micro;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "Microrregioes{" + "gid=" + gid + ", cd_micro=" + cd_micro + ", nm_micro=" + nm_micro + ", sigla=" + sigla + ", geometria=" + geometria + '}';
    }
    
    
}