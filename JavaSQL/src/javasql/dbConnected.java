/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasql;
// Import the nesscary librarys 

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql .*; 

/**
 *
 * @author waheedrafiq
 */
public class dbConnected {   
// connection setting
   static final String dbURL = "jdbc:mysql://localhost:3306/sampledb";
   static final String username = "root";
   static final String password = "secret";
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
   
public void connect(){
        Connection conn = null;
        Statement stmt = null; 
       try {  
         Class.forName("com.mysql.jdbc.Driver");  
         System.out.println("Connecting to the Epic DataBase");
        
        conn = DriverManager.getConnection(dbURL, username, password);
         // if the connection is not null then we are connected to the DB
        if (conn != null) {
        System.out.println("Connected to your Database.");
        
        }// end of if conn statement 
        
        if (conn == null){
             System.out.println("Something has gone wrong... Not connected.");
        }
       } catch (SQLException ex) {
        ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbConnected.class.getName()).log(Level.SEVERE, null, ex);
        }
}// end of connect method.
   
}// end of public class 
