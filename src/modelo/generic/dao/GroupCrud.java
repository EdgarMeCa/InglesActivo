/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.generic.dao;

import java.util.List;
import modelo.dao.GroupDao;

/**
 *
 * @author emedina
 */
public interface GroupCrud {
    
     /**
     *
     * @param object
     */
    public abstract void insert(GroupDao object);
    
    /**
     *
     * @param object
     */
    public abstract void delete(GroupDao object);
    
    /**
     *
     * @param object
     */
    public abstract void update(GroupDao object);
    
    /**
     *
     * @return
     */
    public abstract List<GroupDao> select();
}
