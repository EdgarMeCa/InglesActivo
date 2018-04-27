/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.search;

import java.util.ArrayList;
import java.util.Calendar;
import modelo.search.criteria.*;
import java.util.List;
import modelo.dao.*;
import modelo.dao.impl.*;
import java.util.Date;

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
    public List<LevelDao> filter4Level(LevelSearchCriteria criteria) {
        List<LevelDao> allRecords = new LevelDaoImpl().select();
        return allRecords;
    }
    
    /**
     *
     * @param criteria
     * @return
     */
    public List<ModuloDao> filter4Modulo(ModuloSearchCriteria criteria) {
        List<ModuloDao> allRecords = new ModuloDaoImpl().select();
        List<ModuloDao> remove = new ArrayList<>();
        if(criteria.getName() != null || !criteria.getName().isEmpty()){
            for(ModuloDao dao : allRecords) {
                if(filter4String(dao.getCode(),criteria.getName())) {
                    remove.add(dao);
                }
            }
        }
        allRecords.removeAll(remove);
        return allRecords;
    }
    /**
     *
     * @param criteria
     * @return
     */
    public List<StatusDao> filter4Status(StatusSearchCriteria criteria) {
        List<StatusDao> allRecords = new StatusDaoImpl().select();
        List<StatusDao> remove = new ArrayList<>();
        if(criteria.getName() != null || !criteria.getName().isEmpty()){
            for(StatusDao dao : allRecords) {
                if(filter4String(dao.getCode(),criteria.getName())) {
                    remove.add(dao);
                }
            }
        }
        allRecords.removeAll(remove);
        return allRecords;
    }
    
    /**
     *
     * @param criteria
     * @return
     */
    public List<StudentDao> filter4Student(StudentSearchCriteria criteria) {
        List<StudentDao> allRecords = new StudentDaoImpl().select();
        List<StudentDao> remove = new ArrayList<>();
        if(criteria.getName() != null || !criteria.getName().isEmpty()) {
            for(StudentDao dao : allRecords) {
                if(filter4String(dao.getName(),criteria.getName())) {
                    remove.add(dao);
                }
            }
        }
        if(criteria.getLastname1() != null || !criteria.getLastname1().isEmpty()) {
            for(StudentDao dao : allRecords) {
                if(filter4String(dao.getLastname1(),criteria.getLastname1())) {
                    remove.add(dao);
                }
            }
        }
        if(criteria.getLastname2() != null || !criteria.getLastname2().isEmpty()) {
            for(StudentDao dao : allRecords) {
                if(filter4String(dao.getLastname2(),criteria.getLastname2())) {
                    remove.add(dao);
                }
            }
        }
        allRecords.removeAll(remove);
        return allRecords;
    }
    
    /**
     *
     * @param criteria
     * @return
     */
    public List<TeacherDao> filter4Teacher(TeacherSearchCriteria criteria) {
        List<TeacherDao> allRecords = new TeacherDaoImpl().select();
        List<TeacherDao> remove = new ArrayList<>();
        if(criteria.getName() != null || !criteria.getName().isEmpty()) {
            for(TeacherDao dao : allRecords) {
                if(filter4String(dao.getName(),criteria.getName())) {
                    remove.add(dao);
                }
            }
        }
        if(criteria.getLastname1() != null || !criteria.getLastname1().isEmpty()) {
            for(TeacherDao dao : allRecords) {
                if(filter4String(dao.getFirstLastName(),criteria.getLastname1())) {
                    remove.add(dao);
                }
            }
        }
        if(criteria.getLastname2() != null || !criteria.getLastname2().isEmpty()) {
            for(TeacherDao dao : allRecords) {
                if(filter4String(dao.getSecondLastName(),criteria.getLastname2())) {
                    remove.add(dao);
                }
            }
        }
        allRecords.removeAll(remove);
        return allRecords;
    }
    
    /**
     *
     * @param criteria
     * @return
     */
    public List<LatePaymentDao> filter4LatePayment(LatePaymentSearchCriteria criteria) {
         List<LatePaymentDao> allRecords = new LatePaymentImpl().select();
         List<LatePaymentDao> remove = new ArrayList<>();
         if (criteria.isEmpty()) {
             for(LatePaymentDao dao : allRecords) {
                if(filter4DeadlineToPay(dao.getCreateTime())) {
                    remove.add(dao);
                }
            }
         }
         allRecords.removeAll(remove);
         return allRecords;
    }
    
    private boolean filter4String(String value, String criteria) {
        boolean result = true;
        if (value.equalsIgnoreCase(criteria)) {
            result = false;
        }
        return result;
    }
    
    private boolean filter4DeadlineToPay(Date date) {
        boolean result = true;
        Date limitToPay = generateDeadlineToPay(date);
        Date today = new Date();
        if(today.after(limitToPay)) {
            result = false;
        }
        return result;
    }
    
    private Date generateDeadlineToPay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, 7);
        return calendar.getTime();
    }
}