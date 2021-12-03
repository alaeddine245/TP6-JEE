/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dao;

import java.sql.*;
import java.util.Vector;
import com.app.metier.Utilisateur;
/**
 *
 * @author Alaeddine
 */
public class GestUsersDAO {
    public Utilisateur loadUser(String login, String pass) {
        Connection conn = Utilitaire.getConnection();
        Utilisateur u = null;
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM ROOT.\"Utilisateurs\" WHERE LOGIN=? AND PASS=?");
            ps.setString(1, login);
            ps.setString(2, pass);
            ResultSet rsUser = ps.executeQuery();
            if (rsUser.next()) {
                u = new Utilisateur();
                u.setIdUser(new Integer(rsUser.getInt("ID_USER")));
                u.setLogin(rsUser.getString("LOGIN"));
                u.setPass(rsUser.getString("PASS"));
                u.setEmail(rsUser.getString("EMAIL"));
                u.setVille(rsUser.getString("VILLE"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }

    public void addUser(String l, String p, String e, String v) {
        Connection conn = Utilitaire.getConnection();
        Utilisateur u = null;
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO ROOT.\"Utilisateurs\"(LOGIN,PASS,EMAIL,VILLE) values(?,?,?,?)");
            ps.setString(1, l);
            ps.setString(2, p);
            ps.setString(3, e);
            ps.setString(4, v);
            ps.executeUpdate();
        } catch (SQLException e2) {
            e2.printStackTrace();
        }
    }

    public Vector<Utilisateur> selectAll() {
        Connection conn = Utilitaire.getConnection();
        Vector<Utilisateur> users = new Vector<Utilisateur>();
        Utilisateur u = null;
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM ROOT.\"Utilisateurs\"");
            ResultSet rsUser = ps.executeQuery();
            while (rsUser.next()) {
                u = new Utilisateur();
                u.setIdUser(new Integer(rsUser.getInt("ID_USER")));
                u.setLogin(rsUser.getString("LOGIN"));
                u.setPass(rsUser.getString("PASS"));
                u.setEmail(rsUser.getString("EMAIL"));
                u.setVille(rsUser.getString("VILLE"));
                users.add(u);
            }
    }
    catch (SQLException e) {
        e.printStackTrace();
    }
    return users ;
} 
    public boolean suppUser(String id){
        Connection conn=Utilitaire.getConnection();
        Utilisateur u=null;
        try {
            PreparedStatement ps=conn.prepareStatement("DELETE FROM ROOT.\"Utilisateurs\" WHERE ID_USER=?");
            ps.setInt(1, Integer.parseInt(id) );
            ps.executeUpdate();
        } catch (SQLException e2) {
            e2.printStackTrace();
            return false;
        }
        return true;
    }
    public boolean updateUser(String id,String l,String p, String e,String v){
        Connection conn=Utilitaire.getConnection();
        Utilisateur u=null;
        try {
            PreparedStatement ps=conn.prepareStatement("UPDATE ROOT.\"Utilisateurs\" SET EMAIL=?,VILLE=?,LOGIN=?,PASS=? WHERE ID_USER=?");
            ps.setString(1,e );
            ps.setString(2,v );
            ps.setString(3,l );
            ps.setString(4,p );
            ps.setInt(5,Integer.parseInt(id));
            ps.executeUpdate();
        } catch (SQLException e2) { e2.printStackTrace();
            return false; }
        return true;
    }
}
