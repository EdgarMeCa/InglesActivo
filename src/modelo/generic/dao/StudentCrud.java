/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.generic.dao;

import java.util.List;
import modelo.dao.StudentDao;

/**
 *
 * @author emedina
 */
public interface StudentCrud {
    
     /**
     *
     * @param object
     */
    public abstract void insert(StudentDao object);
    
    /**
     *
     * @param object
     */
    public abstract void delete(StudentDao object);
    
    /**
     *
     * @param object
     */
    public abstract void update(StudentDao object);
    
    /**
     *
     * @return
     */
    public abstract List<StudentDao> select();
}
