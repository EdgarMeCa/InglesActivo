/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
/**
 *
 * @author ASUS
 */
public class DBConnection {
    
    private final String HOST = "jdbc:mysql://localhost/";
    private final String DBNAME = "inglesactivo";
    private final String USERNAME = "root";
    private final String PASSWORD = "";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    
    private static  DBConnection DBCONNECTION = null;
    private Connection conn = null;
    
    private DBConnection () {
        
    }
    
    public static DBConnection getInstance() {
        if (DBCONNECTION == null)
        {
            DBCONNECTION = new DBConnection();
        }
        return DBCONNECTION;
    }
    
    /**
     *
     * @return Connection
     */
    public Connection openConnection() {
        try
        {
            conn = DriverManager.getConnection(HOST + DBNAME, USERNAME, PASSWORD);
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();//Then it will be exchange for a logger
        }
        return conn;
    }
    
    /**
     *
     */
    public void closeConnection() {
        if (conn != null)
        {
            try 
            {
                conn.close();
            } 
            catch (SQLException ex) 
            {
                ex.printStackTrace();//Then it will be exchange for a logger
            }
                
        }
    }
    
}