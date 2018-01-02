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
import java.sql.PreparedStatement;
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
    private PreparedStatement ps = null;
    
    @Override
    public boolean insert(TeacherDao object) {
        boolean result = false;
        String query = "";
        
        query += "INSERT INTO" + " ";
        query += "teacher"     + " ";
        query += "VALUES"      + " ";
        query += "("           + " ";
        query += "null"        + ",";
        query += "'" + object.getName()           + "'" + ",";
        query += "'" + object.getFirstLastName()  + "'" + ",";
        query += "'" + object.getSecondLastName() + "'" + ",";
        query += "'" + object.getHomePhone()      + "'" + ",";
        query += "'" + object.getPersonalPhone()  + "'" + ",";
        query += "'" + object.getPersonalEmail()  + "'" + ",";
        query += "'" + object.getWorkEmail()      + "'" + ",";
        query += "'" + object.getPassword()       + "'" + ",";
        query += "'" + object.getCurp()           + "'" + ",";
        query += "'" + object.getCedula()         + "'" + ",";
        query += "'" + object.getExperience()     + "'" + ",";
        query += "'" + object.getPicture()        + "'" + ",";
        query += "'" + object.getStartDate()      + "'" + ",";
        query += "'" + object.getEndDate()        + "'" + ",";
        query += "'" + object.getAddress()        + "'" + ",";
        query += "'" + object.getLevel()          + "'" + ",";
        query += "'" + object.getStatus()         + "'";
        query += ")";
                        
        try
        {
            connection = DBConnection.getInstance().openConnection();
            //ps = connection.prepareStatement(query);
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
                connection.close();
            } 
            catch (SQLException ex)
            {
                ex.printStackTrace();
            }
            
        }
        return result;
    }

    @Override
    public boolean delete(TeacherDao object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(TeacherDao object) {
        boolean result = false;
        String query = "";
        
        query += "UPDATE"  + " ";
        query += "teacher" + " ";
        query += "SET"     + " ";
        query += "Name"          + " = " + object.getName()           + ",";
        query += "LName1"        + " = " + object.getFirstLastName()  + ",";
        query += "LName2"        + " = " + object.getSecondLastName() + ",";
        query += "PhoneHome"     + " = " + object.getHomePhone()      + ",";
        query += "PhonePersonal" + " = " + object.getPersonalPhone()  + ",";
        query += "EmailPersonal" + " = " + object.getPersonalEmail()  + ",";
        query += "EmailWork"     + " = " + object.getWorkEmail()      + ",";
        query += "Password"      + " = " + object.getPassword()       + ",";
        query += "Curp"          + " = " + object.getCurp()           + ",";
        query += "Cedula"        + " = " + object.getCedula()         + ",";
        query += "Experience"    + " = " + object.getExperience()     + ",";
        query += "Picture"       + " = " + object.getPicture()        + ",";
        query += "StartDate"     + " = " + object.getStartDate()      + ",";
        query += "EndDate"       + " = " + object.getEndDate()        + ",";
        query += "Address"       + " = " + object.getAddress()        + ",";
        query += "Level"         + " = " + object.getLevel()          + ",";
        query += "Status"        + " = " + object.getStatus()         + " ";
        query += "WHERE"                                              + " ";
        query += "idTeacher"     + " = " + object.getId();
        
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
                connection.close();
            } 
            catch (SQLException ex)
            {
                ex.printStackTrace();
            }
            
        }
        return result;
    }

    @Override
    public List<TeacherDao> select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}