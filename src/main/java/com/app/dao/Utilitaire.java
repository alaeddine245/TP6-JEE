/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dao;

import java.sql.*;

/**
 *
 * @author Alaeddine
 */
public class Utilitaire {

    private static Connection conn;

    static {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn= DriverManager.getConnection("jdbc:derby://localhost:1527/BaseUsers", "root","root");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }

    public static void main(String[] args) {
        Connection c = Utilitaire.getConnection();
    }
}
