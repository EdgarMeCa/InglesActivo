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
    private SearchFilter filter;
    
    public Search() {
        filter = new SearchFilter();
    }
    
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
    
    /**
     *
     * @param criteria
     * @return
     */
    public List<StudentDao> search4Student(StudentSearchCriteria criteria) {
        return filter.filter4Student(criteria);
    }   
    
    /**
     *
     * @param criteria
     * @return
     */
    public List<StatusDao> search4Status(StatusSearchCriteria criteria) {
        return filter.filter4Status(criteria);
    }
    
    /**
     *
     * @param criteria
     * @return
     */
    public List<ModuloDao> search4Modulo(ModuloSearchCriteria criteria) {
        return filter.filter4Modulo(criteria);
    }
}