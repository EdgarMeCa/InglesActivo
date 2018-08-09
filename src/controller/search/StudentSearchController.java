/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.search;

import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.dao.StudentDao;
import modelo.search.Search;
import modelo.search.criteria.StudentSearchCriteria;
import vista.search.panel.StudentSearch;

/**
 *
 * @author emedina
 */
public class StudentSearchController {
    private StudentSearch studentSearch;

    public StudentSearchController(StudentSearch studentSearch) {
        this.studentSearch = studentSearch;
    }
    
    public void clear() {
        this.studentSearch.getjTextName().setText(null);
        this.studentSearch.getjTextLastname1().setText(null);
        this.studentSearch.getjTextLastname2().setText(null);
        this.studentSearch.getjDateInitialDate().setDate(new Date());
        this.studentSearch.getjDateEndDate().setDate(new Date());
        this.studentSearch.getjComboSchoolLevel().setSelectedIndex(0);
    }
    
    public void search() {
        Search search = new Search();
        StudentSearchCriteria criteria = createCriteria();
        List<StudentDao> searchResult = search.search4Student(criteria);
        fillTableResult(searchResult);
    }
    
    private void fillTableResult(List<StudentDao> searchResult) {
        DefaultTableModel model = createTableModel();
        for(int i = 0; i < searchResult.size(); i++) {
            model.addRow(searchResult.get(i).toArray());
        }
        studentSearch.getjTableResults().setModel(model);
    }
    
    private DefaultTableModel createTableModel() {
        String[] columsName = {"Nombre","Apellido Materno","Apellido Paterno"};
        DefaultTableModel defaultModel = new DefaultTableModel(null,columsName);
        return defaultModel;
    }
     
    private StudentSearchCriteria createCriteria() {
        StudentSearchCriteria criteria = new StudentSearchCriteria();
        criteria.setName(this.studentSearch.getjTextName().getText());
        criteria.setLastname1(this.studentSearch.getjTextLastname1().getText());
        criteria.setLastname2(this.studentSearch.getjTextLastname2().getText());
        criteria.setInitialDate(this.studentSearch.getjDateInitialDate().getDate());
        criteria.setEndDate(this.studentSearch.getjDateEndDate().getDate());
        criteria.setSchoolLevel((String) this.studentSearch.getjComboSchoolLevel().getSelectedItem());
        return criteria;
    } 
}