/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.generic.dao;

import java.util.List;
import modelo.dao.PresenceDao;

/**
 *
 * @author emedina
 */
public interface PresenceCrud {
     /**
     *
     * @param object
     */
    public abstract void insert(PresenceDao object);
    
    /**
     *
     * @param object
     */
    public abstract void delete(PresenceDao object);
    
    /**
     *
     * @param object
     */
    public abstract void update(PresenceDao object);
    
    /**
     *
     * @return
     */
    public abstract List<PresenceDao> select();
}
