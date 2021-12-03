/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.metier;

import com.app.dao.GestArticlesDAO;
import java.util.Vector;

/**
 *
 * @author Alaeddine
 */
public class GestArticles {

    GestArticlesDAO dao;

    public GestArticles() {
        dao = new GestArticlesDAO();
    }

    public Article Chercher(String code, String nom) {
        return dao.loadArticle(code, nom);
    }

    public void ajouter(Article u) {
        dao.addArticle(u.getCode(), u.getDesc(), u.getQuant(), u.getPrix(), u.getNom());
    }

    public Vector lister() {
        return dao.selectAll();
    }

    public boolean delete(String code) {
        return dao.deleteArticle(code);
    }

    public boolean update(String code, String nom, String description, String quantite, String prix) {
        return dao.updateArticle(code, nom, description, quantite, prix);
    }

}
