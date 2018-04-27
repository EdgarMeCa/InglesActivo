/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao.impl;

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
    public List<StatusDao> select() {
        String query = createQuerySelect();
        List<StatusDao> result =  (List<StatusDao>)(Object)CrudOperation.select(query,new StatusDao());
        return result;
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