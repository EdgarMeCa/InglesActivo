/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao.impl;

import java.util.List;
import modelo.dao.GroupDao;
import modelo.generic.dao.Crud;

/**
 *
 * @author emedina
 */
public class GroupDaoImpl implements Crud{
    private GroupDao groupDao;
    
    public GroupDaoImpl() {
        
    }

    public GroupDaoImpl(GroupDao groupDao) {
        this.groupDao = groupDao;
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
    public List<GroupDao> select() {
        String query = createQuerySelect();
        List<GroupDao> result = (List<GroupDao>)(Object)CrudOperation.select(query,new GroupDao());
        return result;
    }
    
    private String createQuerySelect() {
        String query = "";
        query += "SELECT"   + " ";
        query += "*"        + " ";
        query += "FROM"     + " ";
        query += "groupset" + " ";
        return query;
    }
    
    private String createQueryDelete() {
        String query = "";
        query += "DELETE"     + " ";
        query += "FROM"       + " ";
        query += "groupset"   + " ";
        query += "WHERE"      + " ";
        query += "idGroupset" + " ";
        query += "="          + " ";
        query += groupDao.getId();
        return query;
    }
}