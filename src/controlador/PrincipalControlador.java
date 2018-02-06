/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.PrincipalUI;
import EnumHelper.*;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.TableModel;
import modelo.dao.LatePaymentDao;
import modelo.search.Search;
import vista.*;

/**
 *
 * @author emedina
 */
public class PrincipalControlador {
    private PrincipalUI principal;

    public PrincipalControlador(PrincipalUI principal) {
        this.principal = principal;
        //initTableResult();
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
        TableModel table = principal.getjTableLatePayment().getModel();
        List<LatePaymentDao> searchResult = search.search4LatePayment();
        for(int i = 0; i < searchResult.size(); i++) {
            table.setValueAt(searchResult.get(i).getName(), i, 0);
            table.setValueAt(searchResult.get(i).getLastname1(),i,1);
            table.setValueAt(searchResult.get(i).getLastname2(), i, 2);
            table.setValueAt(searchResult.get(i).getSchedule(), i, 3);
            table.setValueAt(searchResult.get(i).getCreateTime(), i, 4);
        }
    }
}