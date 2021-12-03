/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.metier;

/**
 *
 * @author Alaeddine
 */
public class Article {
    private Integer idArtic;
    private String code;
    private String nom;
    private String desc;
    private int quant;
   
    private double prix;
    public String getNom() {
        return nom; 
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getCode() {
        return code; 
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Integer getIdArtic() {
        return idArtic; }
    public void setIdUser(Integer idArtic) {
        this.idArtic = idArtic;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public int getQuant() {
        return quant;
    }
    public void setQuant(int quant) {
        this.quant = quant;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
}
