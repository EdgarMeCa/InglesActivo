/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.generic.dao;

import java.util.List;
import modelo.dao.ModuloDao;

/**
 *
 * @author emedina
 */
public interface ModuloCrud {
    
     /**
     *
     * @param object
     */
    public abstract void insert(ModuloDao object);
    
    /**
     *
     * @param object
     */
    public abstract void delete(ModuloDao object);
    
    /**
     *
     * @param object
     */
    public abstract void update(ModuloDao object);
    
    /**
     *
     * @return
     */
    public abstract List<ModuloDao> select();
}
