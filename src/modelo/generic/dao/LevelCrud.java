/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.generic.dao;

import java.util.List;
import modelo.dao.LevelDao;

/**
 *
 * @author emedina
 */
public interface LevelCrud {
    
    /**
     *
     * @param object
     */
    public abstract void insert(LevelDao object);
    
    /**
     *
     * @param object
     */
    public abstract void delete(LevelDao object);
    
    /**
     *
     * @param object
     */
    public abstract void update(LevelDao object);
    
    /**
     *
     * @return
     */
    public abstract List<LevelDao> select();
}
