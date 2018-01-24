/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.search;

import java.util.List;
import modelo.dao.TeacherDao;
import modelo.dao.impl.TeacherDaoImpl;

/**
 *
 * @author EMEDINA
 */
public class SearchFilter {
    
    public List<TeacherDao> filter4Teacher(TeacherSearchCriteria criteria) {
        List<TeacherDao> allRecords = new TeacherDaoImpl().select();
        if(criteria.getName() != null) {
            for(TeacherDao dao : allRecords) {
                if(filter4String(dao.getName(),criteria.getName())) {
                    allRecords.remove(dao);
                }
            }
        }
        if(criteria.getLastname1() != null) {
            for(TeacherDao dao : allRecords) {
                if(filter4String(dao.getFirstLastName(),criteria.getLastname1())) {
                    allRecords.remove(dao);
                }
            }
        }
        if(criteria.getLastname2() != null) {
            for(TeacherDao dao : allRecords) {
                if(filter4String(dao.getSecondLastName(),criteria.getLastname2())) {
                    allRecords.remove(dao);
                }
            }
        }
        return allRecords;
    }
    
    private boolean filter4String(String value, String criteria) {
        boolean result = true;
        if (value.equals(criteria)) {
            result = false;
        }
        return result;
    }
   
}
