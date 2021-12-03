/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import com.app.metier.Article;

/**
 *
 * @author Alaeddine
 */
public class GestArticlesDAO {

    public boolean deleteArticle(String code) {
        Connection conn = Utilitaire.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("delete from ROOT.\"Articles\" where CODE =? ");
            ps.setString(1, code);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateArticle(String code, String nom, String description, String quantite, String prix) {
        Connection conn = Utilitaire.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE ROOT.\"Articles\" SET CODE=?,NOM=?,DESCRIPTION=?,QUANTITE=?,PRIX=? WHERE CODE=? ");
            ps.setString(1, code);
            ps.setString(2, nom);
            ps.setString(3, description);
            ps.setInt(4, Integer.parseInt(quantite));
            ps.setDouble(5, Double.parseDouble(prix));
            ps.setString(6, code);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Article loadArticle(String code, String nom) {
        Connection conn = Utilitaire.getConnection();
        Article u = null;
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM ROOT.\"Articles\" WHERE CODE=? AND NOM=?");
            ps.setString(1, code);
            ps.setString(2, nom);
            ResultSet rsUser = ps.executeQuery();
            if (rsUser.next()) {
                u = new Article();
                u.setCode(rsUser.getString("CODE"));
                u.setNom(rsUser.getString("NOM"));
                u.setDesc(rsUser.getString("DESCRIPTION"));
                u.setQuant(new Integer(rsUser.getInt("QUANTITE")));
                u.setPrix(new Double(rsUser.getDouble("PRIX")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }

    public void addArticle(String c, String d, Integer q, Double p, String n) {
        Connection conn = Utilitaire.getConnection();
        Article u = null;
        try {
            PreparedStatement ps = conn.prepareStatement("insert into ROOT.\"Articles\" (CODE,NOM,DESCRIPTION,QUANTITE,PRIX) values(?,?,?,?,?)");
            ps.setString(1, c);
            ps.setString(2, n);
            ps.setString(3, d);
            ps.setInt(4, q);
            ps.setDouble(5, p);
            ps.executeUpdate();
        } catch (SQLException e2) {
            e2.printStackTrace();
        }
    }

    public Vector selectAll() {
        Connection conn = Utilitaire.getConnection();
        Vector users = new Vector();
        Article u = null;
        try {
            PreparedStatement ps = conn.prepareStatement("select * from ROOT.\"Articles\"");
            ResultSet rsUser = ps.executeQuery();
            while (rsUser.next()) {
                u = new Article();
                u.setCode(rsUser.getString("Code"));
                u.setNom(rsUser.getString("NOM"));
                u.setDesc(rsUser.getString("Description"));
                u.setQuant(new Integer(rsUser.getInt("QUANTITE")));
                u.setPrix(new Double(rsUser.getDouble("PRIX")));
                users.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}
