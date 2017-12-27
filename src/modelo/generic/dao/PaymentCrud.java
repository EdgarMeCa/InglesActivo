/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.generic.dao;

import java.util.List;
import modelo.dao.PaymentDao;

/**
 *
 * @author emedina
 */
public interface PaymentCrud {
    
    /**
     *
     * @param object
     */
    public abstract void insert(PaymentDao object);
    
    /**
     *
     * @param object
     */
    public abstract void delete(PaymentDao object);
    
    /**
     *
     * @param object
     */
    public abstract void update(PaymentDao object);
    
    /**
     *
     * @return
     */
    public abstract List<PaymentDao> select();
}
