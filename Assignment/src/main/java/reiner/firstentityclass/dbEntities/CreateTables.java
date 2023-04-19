/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reiner.firstentityclass.dbEntities;


import java.sql.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Seamus Ryan 19254555
 * 
 * CE4208 Distributed Systems
 */

    



/**
 *
 * @author Reine
 */


public class CreateTables {
    
    private static final String URL = "jdbc:derby://localhost:1527/sample";
    private static final String USER = "app";
    private static final String PASSWD = "app";

    public static void addTable(String table) {
        String sql = "";
        
        if (table.equals("FREELANCER")){   
            sql = "CREATE TABLE FREELANCERS " +
                  "(ID INTEGER not NULL, " +
                  " Name VARCHAR(255), " + 
                  " Balance INTEGER, " +
                  " PRIMARY KEY ( id ))"; 
        }
        if (table.equals("PROVIDER")){   
            sql = "CREATE TABLE PROVIDER " +
                  "(ID INTEGER not NULL, " +
                  " Name VARCHAR(255), " + 
                  " PRIMARY KEY ( id ))"; 
        }
        if (table.equals("ADMIN")){   
            sql = "CREATE TABLE ADMIN " +
                  "(ID INTEGER not NULL, " +
                  " Name VARCHAR(255), " + 
                  " PRIMARY KEY ( id ))"; 
        }
        if (table.equals("JOBS")){   
            sql = "CREATE TABLE JOB " +
                  "(JOBID INTEGER not NULL, " +
                  " Title VARCHAR(255), " +
                  " DESCRIPTION VARCHAR(255), " +
                  " OWNERID INTEGER, " +
                  " PAYMENT INTEGER, " +
                  " STATUS VARCHAR(255), " +
                  " PRIMARY KEY ( JOBID ))"; 
        }
        
        // use try with resource
        try (Connection connect = DriverManager.getConnection(URL, USER, PASSWD);
                Statement stmt = connect.createStatement();) {

            // execute statement 
            stmt.executeUpdate(sql);

            JOptionPane.showMessageDialog(null,
                    "Table " + table + " successfully created");
            
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Message: " + sqle.getMessage());
            JOptionPane.showMessageDialog(null, "Code: " + sqle.getSQLState());
        }
    }
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                    "Creating tables");
        addTable("FREELANCER");
        addTable("PROVIDER");
        addTable("ADMIN");
        addTable("JOBS");
    }
}
