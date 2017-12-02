/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.generic.dao;

import modelo.dao.LoginDao;

/**
 *
 * @author ASUS
 */
public interface Login {
    
    /**
     *
     * @param object
     * @return 
     */
    public abstract boolean loginUser(LoginDao object);
    
}
