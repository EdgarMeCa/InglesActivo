/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.search;

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
    
}
