/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao.impl;

import java.util.List;
import modelo.dao.StudentDao;
import modelo.generic.dao.Crud;

/**
 *
 * @author emedina
 */
public class StudentDaoImpl implements Crud{

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
    public List<StudentDao> select() {
        String query = createQuerySelect();
        List<StudentDao> result = (List<StudentDao>)(Object)CrudOperation.select(query,new StudentDao());
        return result;
    }
    
    private String createQuerySelect() {
        String query = "";
        query += "SELECT" + " ";
        query += "*"      + " ";
        query += "FROM"   + " ";
        query += "student";
        return query;
    }
}