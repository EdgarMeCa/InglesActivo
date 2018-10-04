/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.generic.dao;

/**
 *
 * @author EMEDINA
 */
public interface QueryCreatable {
    
    /**
     *
     * @return
     */
    public abstract String createInsertQuery();
    
    /**
     *
     * @return
     */
    public abstract String createUpdateQuery();
    
    /**
     *
     * @return
     */
    public abstract String createDeleteQuery();
    
     /**
     *
     * @return
     */
    public abstract String createSelectQuery();
    
}
