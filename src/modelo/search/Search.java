/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.search;

import modelo.search.criteria.*;
import java.util.List;
import modelo.dao.*;

/**
 *
 * @author EMEDINA
 */
public class Search {
    private SearchFilter filter = new SearchFilter();
    
    /**
     *
     * @param criteria
     * @return
     */
    public List<LatePaymentDao> search4LatePayment(LatePaymentSearchCriteria criteria) {
        return filter.filter4LatePayment(criteria);
    }
    
    /**
     *
     * @param criteria
     * @return
     */
    public List<TeacherDao> search4Teacher(TeacherSearchCriteria criteria) {
        return filter.filter4Teacher(criteria);
    }
    
    public List<StudentDao> search4Student(StudentSearchCriteria criteria) {
        return null;
    }
    
}
