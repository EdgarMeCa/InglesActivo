/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.search;

import java.util.List;
import modelo.dao.TeacherDao;
import modelo.search.Search;
import modelo.search.TeacherSearchCriteria;
import vista.search.panel.TeacherSearch;

/**
 *
 * @author EMEDINA
 */
public class TeacherSearchControlador {
    private TeacherSearch teacherSearh;

    public TeacherSearchControlador(TeacherSearch teacherSearh) {
        this.teacherSearh = teacherSearh;
    }
    
    public void clear() {
        this.teacherSearh.getjTextLastname1().setText(null);
        this.teacherSearh.getjTextLastname2().setText(null);
        this.teacherSearh.getjTextName().setText(null);
        this.teacherSearh.getjTableResult().removeRowSelectionInterval(0, this.teacherSearh.getjTableResult().getRowCount()-1);
        this.teacherSearh.getjRadioButtonEdit();
        this.teacherSearh.getjRadioButtonPay();
    }
    
    public void search() {
        Search search = new Search();
        TeacherSearchCriteria criteria = createCriteria();
        List<TeacherDao> list = search.search4Teacher(criteria);
    }
    
    private TeacherSearchCriteria createCriteria() {
        String name = this.teacherSearh.getjTextName().getText();
        String lastname1 = this.teacherSearh.getjTextLastname1().getText();
        String lastname2 = this.teacherSearh.getjTextLastname2().getText();
        TeacherSearchCriteria criteria = new TeacherSearchCriteria(name,lastname1,lastname2);
        return criteria;
    }
    
    private void fillTable(List<TeacherDao> list) {
        for(int i = 0; i < list.size();i++) {
            this.teacherSearh.getjTableResult().setValueAt(list.get(i).getName() + " " + list.get(i).getFirstLastName(), i, 0);
            this.teacherSearh.getjTableResult().setValueAt(list.get(i).getPersonalPhone(), i, 0);
        }
    }
    
}
