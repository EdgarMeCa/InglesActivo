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
        ResultSet result = CrudOperation.select(query);
        List<GroupDao> list = resultSetToList(result);
        return list;
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
    
     private List<GroupDao> resultSetToList(ResultSet result){
        List<GroupDao> list = new ArrayList<>();
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
    
    private GroupDao fillDao (ResultSet element) throws SQLException{
        GroupDao object = new GroupDao();
        return object;
    }   
}