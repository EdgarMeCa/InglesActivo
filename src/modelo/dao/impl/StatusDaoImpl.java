/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.dao.StatusDao;
import modelo.generic.dao.Crud;

/**
 *
 * @author emedina
 */
public class StatusDaoImpl implements Crud {
    private StatusDao statusDao;

    public StatusDaoImpl() {
        
    }

    public StatusDaoImpl(StatusDao statusDao) {
        this.statusDao = statusDao;
    }
    
    @Override
    public boolean insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List select() {
        String query = createQuerySelect();
        ResultSet result = CrudOperation.select(query);
        List<StatusDao> list = resultSetToList(result);
        return list;
    }
    
    private List<StatusDao> resultSetToList(ResultSet result) {
        List<StatusDao> list = new ArrayList<>();
        try {
            while(result.next()) {
                list.add(fillDao(result));
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    private StatusDao fillDao(ResultSet element) throws SQLException {
        StatusDao object = new StatusDao();
        object.setId(element.getInt(null));
        object.setCode(element.getString(null));
        object.setDescription(element.getString(null));
        return object;
    }
    
    private String createQuerySelect() {
        String query = "";
        query += "SELECT" + " ";
        query += "*"      + " ";
        query += "FROM"   + " ";
        query += "status";
        return query;
    }
}
