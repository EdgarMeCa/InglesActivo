/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao.impl;

import database.DBConnection;
import modelo.dao.LoginDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.generic.dao.Login;
import database.DBTables;

/**
 *
 * @author ASUS
 */
public class LoginDaoImpl implements Login,DBTables{
    
    private Statement statement = null;
    private Connection connection = null;
    private ResultSet resultSet = null;

    @Override
    public boolean loginUser(LoginDao object) {
        String query = "SELECT * FROM " + TEACHER + " WHERE Correo = '" + object.getUsername() + "' AND Password = '" + object.getPassword() + "';";
        boolean loginSuccessful = false;
        int resultCount = 0;
        
        try
        {
            connection = DBConnection.getInstance().openConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            
            while(resultSet.next())
            {
                resultCount++;
            }
            
            if (validateLogin(resultCount))
            {
                loginSuccessful = true;
            }
            else
            {
                loginSuccessful = false;
                throw new Exception("********Login failed check credentials********");
            }
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();//Then it will be exchange for a logger
        }
        catch (Exception e)
        {
            e.printStackTrace();//Then it will be exchange for a logger
        }
        finally
        {
            try
            {
                resultSet.close();
                statement.close();
                DBConnection.getInstance().closeConnection();
            }
            catch (SQLException ex)
            {
                ex.printStackTrace();//Then it will be exchange for a logger
            }
        }
        return loginSuccessful;
    }
    
    private boolean validateLogin(int numberResult){
        return numberResult == 1;
    }  
}
