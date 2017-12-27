/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao.impl;

import java.util.List;
import java.util.logging.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import database.DBConnection;
import modelo.generic.dao.TeacherCrud;
import modelo.dao.TeacherDao;

/**
 *
 * @author ASUS
 */
public class TeacherDaoImpl implements TeacherCrud {
    private Statement statement = null;
    private Connection connection = null;
    private ResultSet resultSet = null;
    private static final Logger LOGGER = null;
    
    @Override
    public void insert(TeacherDao object) {
  
        String query = "";
                        
        try
        {
            connection = DBConnection.getInstance().openConnection();
            statement = connection.createStatement();
            statement.execute(query);
        }
        catch (SQLException ex)
        {
            //LOGGER.log(Level.SEVERE, "TeacherDaoImpl, insert(), Error to insert data to the database : {0}", ex.getMessage());
        }
        finally
        {
            try
            {
                statement.close();
                connection.close();
            } 
            catch (SQLException ex)
            {
                //LOGGER.log(Level.SEVERE, "TeacherDaoImpl, insert(), Error to close the database connection : {0}", ex.getMessage());
            }
            
        }
    }

    @Override
    public void delete(TeacherDao object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(TeacherDao object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TeacherDao> select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
