/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import enums.actions.ActionMenu;
import enums.actions.SearchMode;
import java.util.Date;
import vista.PrincipalUI;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import modelo.dao.LatePaymentDao;
import modelo.search.Search;
import modelo.search.criteria.LatePaymentSearchCriteria;
import vista.*;

/**
 *
 * @author emedina
 */
public class PrincipalControlador {
    private PrincipalUI principal;

    public PrincipalControlador(PrincipalUI principal) {
        this.principal = principal;
        initTableResult();
    }
    
    public void menuAction(ActionMenu action) {
        switch(action) {
            case NEWTEACHER :
                loadForm(new TeacherUI_ABC());    
                break;
            case SEARCHTEACHER :
                loadForm(new SearchFormUI(SearchMode.TEACHER));
            default :
        }
    } 
    
    private void loadForm(JFrame frame) {
        frame.setVisible(true);
        principal.setVisible(false);
    }
    
    private void initTableResult() {
        Search search = new Search();
        LatePaymentSearchCriteria criteria = new LatePaymentSearchCriteria();
        List<LatePaymentDao> searchResult = search.search4LatePayment(criteria);
        DefaultTableModel model = createTableModel();
        for(int i = 0; i < searchResult.size(); i++) {
            model.addRow(searchResult.get(i).toArray());
        }
        principal.getjTableLatePayment().setModel(model);
    }
    
    private DefaultTableModel createTableModel() {
        String[] columsName = {"Nombre","Apellido Paterno","Apellido Materno","Horario","Fecha Inicio"};
        DefaultTableModel defaultModel = new DefaultTableModel(null,columsName);
        return defaultModel;
    }
}