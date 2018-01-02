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
     * @return 
     */
    public abstract boolean insert(TeacherDao object);
    
    /**
     *
     * @param object
     * @return 
     */
    public abstract boolean delete(TeacherDao object);
    
    /**
     *
     * @param object
     * @return 
     */
    public abstract boolean update(TeacherDao object);
    
    /**
     *
     * @return
     */
    public abstract List<TeacherDao> select();
}
