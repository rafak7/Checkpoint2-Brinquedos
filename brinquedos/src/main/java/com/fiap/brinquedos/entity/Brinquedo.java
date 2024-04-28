package com.fiap.brinquedos.entity;

import jakarta.persistence.*;

@Entity
@SequenceGenerator(name="invs", sequenceName = "SQ_TB_BRINQUEDO", allocationSize = 1)
@Table (name = "TB_BRINQUEDO")
public class Brinquedo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY, generator = "invs")
    @Column(name = "BRINQUEDO_ID")
    private Integer idBrinquedo;

    @Column(name = "BRINQUEDO_NM", length = 500, nullable = false )
    private String brinquedoNm;

    @Column(name = "BRINQUEDO_TP", length = 500, nullable = false)
    private String brinquedoTp;

    @Column(name = "BRINQUEDO_CLASSICACAO", length = 500, nullable = false)
    private String brinquedoClassificacao;

    @Column(name = "BRINQUEDO_TAM", length = 500, nullable = false)
    private String brinquedoTam;

    @Column(name = "BRINQUEDO_PRECO", length = 10, nullable = false)
    private Integer brinquedoPreco;


    public Brinquedo() {

    }

    public Brinquedo( String brinquedoNm, String brinquedoTp, String brinquedoClassificacao, String brinquedoTam, Integer brinquedoPreco) {
        super();
        this.brinquedoNm = brinquedoNm;
        this.brinquedoTp = brinquedoTp;
        this.brinquedoClassificacao = brinquedoClassificacao;
        this.brinquedoTam = brinquedoTam;
        this.brinquedoPreco = brinquedoPreco;
    }

    public Integer getIdBrinquedo() {
        return idBrinquedo;
    }

    public void setIdBrinquedo(Integer idBrinquedo) {
        this.idBrinquedo = idBrinquedo;
    }

    public String getBrinquedoNm() {
        return brinquedoNm;
    }

    public void setBrinquedoNm(String brinquedoNm) {
        this.brinquedoNm = brinquedoNm;
    }

    public String getBrinquedoTp() {
        return brinquedoTp;
    }

    public void setBrinquedoTp(String brinquedoTp) {
        this.brinquedoTp = brinquedoTp;
    }

    public String getBrinquedoClassificacao() {
        return brinquedoClassificacao;
    }

    public void setBrinquedoClassificacao(String brinquedoClassificacao) {
        this.brinquedoClassificacao = brinquedoClassificacao;
    }

    public String getBrinquedoTam() {
        return brinquedoTam;
    }

    public void setBrinquedoTam(String brinquedoTam) {
        this.brinquedoTam = brinquedoTam;
    }

    public Integer getBrinquedoPreco() {
        return brinquedoPreco;
    }

    public void setBrinquedoPreco(Integer brinquedoPreco) {
        this.brinquedoPreco = brinquedoPreco;
    }
}
