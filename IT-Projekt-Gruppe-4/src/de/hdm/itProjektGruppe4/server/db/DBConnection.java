package de.hdm.itProjektGruppe4.server.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.google.appengine.api.utils.SystemProperty;

public class DBConnection {

	//Variablen f�r den Verbindungsaufbau
	private static Connection con = null;
	private static String googleUrl = null;
    private static String localUrl = "jdbc:mysql://localhost:3306/testdb?user=root";
        
    public static Connection connection() {
        // Wenn es bisher keine Conncetion zur DB gab, ...
        if (con == null) {
            String url = null;
            try {
                if (SystemProperty.environment.value() == SystemProperty.Environment.Value.Production) {
                    Class.forName("com.mysql.jdbc.GoogleDriver");
                    url = googleUrl;
                } else {
                    Class.forName("com.mysql.jdbc.Driver");
                    url = localUrl;
                }
                con = DriverManager.getConnection(url);
                
            } catch (Exception e) {
                System.err.println("Datenbank konnte nicht geladen werden");
            	con = null;
                e.printStackTrace();
            }
        }
        return con;
    }

    public static void closeConnection(){
		if (con != null) {
			try {
				con.close();
				con = null;
			} 
			catch(Exception e){
				System.err.println("Datenbankverbindung konnte nicht getrennt werden");
			}
		}
		else{
			System.out.println("Verbindung bereits getrennt");
		}
	}
}
