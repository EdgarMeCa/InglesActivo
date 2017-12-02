/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.generic.dao;

import java.util.List;
import modelo.dao.TeacherDao;

public interface TeacherCrud {
    
    /**
     *
     * @param object
     */
    public abstract void insert(TeacherDao object);
    
    /**
     *
     * @param object
     */
    public abstract void delete(TeacherDao object);
    
    /**
     *
     * @param object
     */
    public abstract void update(TeacherDao object);
    
    /**
     *
     * @return
     */
    public abstract List<TeacherDao> select();
}
