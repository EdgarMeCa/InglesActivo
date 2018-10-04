/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao.impl;

import java.util.List;
import modelo.generic.dao.Crud;
import modelo.dao.TeacherDao;

/**
 *
 * @author ASUS
 */
public class TeacherDaoImpl extends TeacherDaoQueryImpl implements Crud {

    /**
     *
     */
    public TeacherDaoImpl() {
        
    }

    /**
     *
     * @param teacherDao
     */
    public TeacherDaoImpl(TeacherDao teacherDao) {
        super(teacherDao);
    }
    
    @Override
    public boolean insert() {
        String query = createInsertQuery(); 
        boolean result = CrudOperation.insert(query);
        return result;
    }

    @Override
    public boolean delete() {
        String query = createDeleteQuery();
        boolean result = CrudOperation.delete(query);
        return result;
    }

    @Override
    public boolean update() {
        String query = createUpdateQuery();
        boolean result = CrudOperation.update(query);
        return result;
    }

    @Override
    public List<TeacherDao> select() {
        String query = createSelectQuery();
        List<TeacherDao> list = (List<TeacherDao>)(Object)CrudOperation.select(query,new TeacherDao());
        return list;
    }
}