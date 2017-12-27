/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.generic.dao;

import java.util.List;
import modelo.dao.StudentGroupDao;

/**
 *
 * @author emedina
 */
public interface StudentGroupCrud {
    
     /**
     *
     * @param object
     */
    public abstract void insert(StudentGroupDao object);
    
    /**
     *
     * @param object
     */
    public abstract void delete(StudentGroupDao object);
    
    /**
     *
     * @param object
     */
    public abstract void update(StudentGroupDao object);
    
    /**
     *
     * @return
     */
    public abstract List<StudentGroupDao> select();
}
