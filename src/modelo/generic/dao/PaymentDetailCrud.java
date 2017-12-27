/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.generic.dao;

import java.util.List;
import modelo.dao.PaymentDetailDao;

/**
 *
 * @author emedina
 */
public interface PaymentDetailCrud {
    
     /**
     *
     * @param object
     */
    public abstract void insert(PaymentDetailDao object);
    
    /**
     *
     * @param object
     */
    public abstract void delete(PaymentDetailDao object);
    
    /**
     *
     * @param object
     */
    public abstract void update(PaymentDetailDao object);
    
    /**
     *
     * @return
     */
    public abstract List<PaymentDetailDao> select();
}
