/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "portos_2014")
public class Porto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "objectid")
    private Integer objectId;
    @Column(name = "uf")
    private String uf;
    @Column(name = "nome_uf")
    private String nome_uf;
    @Column(name = "nome_regia")
    private String nome_regia;  
    @Column(name = "municipio")
    private String municipio;
    @Column(name = "codmun")
    private Integer codmun;
    @Column(name = "sum_total")
    private double sum_total;
    @Column(name = "geom")
    private Geometry geometria;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNome_uf() {
        return nome_uf;
    }

    public void setNome_uf(String nome_uf) {
        this.nome_uf = nome_uf;
    }

    public String getNome_regia() {
        return nome_regia;
    }

    public void setNome_regia(String nome_regia) {
        this.nome_regia = nome_regia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Integer getCodmun() {
        return codmun;
    }

    public void setCodmun(Integer codmun) {
        this.codmun = codmun;
    }

    public double getSum_total() {
        return sum_total;
    }

    public void setSum_total(double sum_total) {
        this.sum_total = sum_total;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "Porto{" + "gid=" + gid + ", objectId=" + objectId + ", uf=" + uf + ", nome_uf=" + nome_uf + ", nome_regia=" + nome_regia + ", municipio=" + municipio + ", codmun=" + codmun + ", sum_total=" + sum_total + ", geometria=" + geometria + '}';
    }
    
    
    
    
    
}