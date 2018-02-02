/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.PrincipalUI;
import EnumHelper.*;
import javax.swing.JFrame;
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
        
    }
}