/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.metier;

import com.app.dao.GestUsersDAO;
import java.util.Vector;

/**
 *
 * @author Alaeddine
 */
public class GestUsers {

    GestUsersDAO dao;

    public GestUsers() {
        dao = new GestUsersDAO();
    }

    public Utilisateur Chercher(String login, String pass) {
        return dao.loadUser(login, pass);
    }

    public void ajouter(Utilisateur u) {
        dao.addUser(u.getLogin(), u.getPass(), u.getEmail(), u.getVille());
    }

    public Vector lister() {
        return dao.selectAll();
    }
    public boolean supprimer(String id){
        return dao.suppUser(id);
    }
    public boolean update(Utilisateur u){
        return dao.updateUser(u.getIdUser().toString(),u.getLogin(), u.getPass(),u.getEmail(),u.getVille());
    }
}
