/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.generic.dao;

import java.util.List;
import modelo.dao.StatusDao;

/**
 *
 * @author emedina
 */
public interface StatusCrud {
    
    /**
     *
     * @param object
     */
    public abstract void insert(StatusDao object);
    
    /**
     *
     * @param object
     */
    public abstract void delete(StatusDao object);
    
    /**
     *
     * @param object
     */
    public abstract void update(StatusDao object);
    
    /**
     *
     * @return
     */
    public abstract List<StatusDao> select();
    
}
