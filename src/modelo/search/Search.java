/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.search;

import modelo.search.criteria.TeacherSearchCriteria;
import java.util.List;
import modelo.dao.*;
import modelo.dao.impl.LatePaymentImpl;

/**
 *
 * @author EMEDINA
 */
public class Search {
    private SearchFilter filter = new SearchFilter();
    
    public List<LatePaymentDao> search4LatePayment() {
        return filter.filter4LatePayment();
    }
    
    public List<TeacherDao> search4Teacher(TeacherSearchCriteria criteria) {
        return filter.filter4Teacher(criteria);
    }
    
}
