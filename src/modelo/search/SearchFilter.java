/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.search;

import modelo.search.criteria.TeacherSearchCriteria;
import java.util.List;
import modelo.dao.*;
import modelo.dao.impl.*;

/**
 *
 * @author EMEDINA
 */
public class SearchFilter {
    
    /**
     *
     * @param criteria
     * @return
     */
    public List<TeacherDao> filter4Teacher(TeacherSearchCriteria criteria) {
        List<TeacherDao> allRecords = new TeacherDaoImpl().select();
        if(criteria.getName() != null || !criteria.getName().isEmpty()) {
            for(TeacherDao dao : allRecords) {
                if(filter4String(dao.getName(),criteria.getName())) {
                    allRecords.remove(dao);
                }
            }
        }
        if(criteria.getLastname1() != null || !criteria.getLastname1().isEmpty()) {
            for(TeacherDao dao : allRecords) {
                if(filter4String(dao.getFirstLastName(),criteria.getLastname1())) {
                    allRecords.remove(dao);
                }
            }
        }
        if(criteria.getLastname2() != null || !criteria.getLastname2().isEmpty()) {
            for(TeacherDao dao : allRecords) {
                if(filter4String(dao.getSecondLastName(),criteria.getLastname2())) {
                    allRecords.remove(dao);
                }
            }
        }
        return allRecords;
    }
    
    public List<LatePaymentDao> filter4LatePayment() {
         List<LatePaymentDao> allRecords = new LatePaymentImpl().select();
         for(LatePaymentDao dao : allRecords) {
             
         }
         return allRecords;
    }
    
    private boolean filter4String(String value, String criteria) {
        boolean result = true;
        if (value.equalsIgnoreCase(criteria)) {
            result = false;
        }
        return result;
    }
    
    private boolean filter4Date() {
        return true;
    }
}
