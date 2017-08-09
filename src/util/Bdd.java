package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe Bdd contenant les informations (url, login, password) et méthodes nécessaire à la connexion et déconnexion de la base de donnée.
 *
 */
public class Bdd {


    //declaration des variables

    private static String url = "jdbc:mysql://localhost/proxibanque_v2";
    private static String user = "root";
    private static String password = "";
    private static Connection cnx;

    //methode se connecter
    public static Connection seConnecter() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url, user, password);
            return cnx;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //methode se deconnecter
    public static void seDeconnecter(Connection cnx) {
        try {
            cnx.close();
        } catch (SQLException ex) {
            System.out.println("Erreur, Essaye encore!!!");
        }
    } 

}
