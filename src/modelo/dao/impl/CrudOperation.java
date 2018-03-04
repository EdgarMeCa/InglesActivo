/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import database.DBConnection;

/**
 *
 * @author emedina
 */
public class CrudOperation {
    private static Statement statement = null;
    private static Connection connection = null;
    private static ResultSet resultSet = null;

    private CrudOperation() {
        
    }
    
    public static boolean insert(String query) {
        boolean result = false;
        try
        {
            connection = DBConnection.getInstance().openConnection();
            statement = connection.createStatement();
            statement.execute(query);
            result = true;
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            try
            {
                statement.close();
                DBConnection.getInstance().closeConnection();
            } 
            catch (SQLException ex)
            {
                ex.printStackTrace();
            }
        }
        return result;
    }
    
     public static boolean update(String query) {
        boolean result = false;
        try
        {
            connection = DBConnection.getInstance().openConnection();
            statement = connection.createStatement();
            statement.execute(query);
            result = true;
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            try
            {
                statement.close();
                DBConnection.getInstance().closeConnection();
            } 
            catch (SQLException ex)
            {
                ex.printStackTrace();
            }
        }
        return result;
    }
     
    public static boolean delete(String query) {
        boolean result = false;
        try
        {
            connection = DBConnection.getInstance().openConnection();
            statement = connection.createStatement();
            statement.execute(query);
            result = true;
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            try
            {
                statement.close();
                DBConnection.getInstance().closeConnection();
            } 
            catch (SQLException ex)
            {
                ex.printStackTrace();
            }
        }
        return result;
    }
    
    public static ResultSet select(String query) {
        ResultSet x;
        try
        {
            connection = DBConnection.getInstance().openConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            /*try
            {
                statement.close();
                connection.close();
            } 
            catch (SQLException ex)
            {
                ex.printStackTrace();
            }*/
        }
        return resultSet;
    }
}