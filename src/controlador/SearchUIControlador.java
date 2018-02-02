/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import EnumHelper.SearchMode;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import vista.SearchFormUI;
import vista.search.panel.*;

/**
 *
 * @author EMEDINA
 */
public class SearchUIControlador {
    private SearchFormUI searchUI;

    public SearchUIControlador(SearchFormUI searchUI) {
        this.searchUI = searchUI;
    }
    
    public void modePanelResolver(SearchMode mode) {
        switch(mode) {
            case TEACHER :
                loadPanel(new TeacherSearch());
                break;
            case STUDENT :
                loadPanel(null);
                break;
            default :
                
        }
    }
    
    private void loadPanel(JPanel panel) {
        this.searchUI.getjPanel1().setLayout(new BoxLayout(this.searchUI.getjPanel1(),BoxLayout.X_AXIS));
        this.searchUI.getjPanel1().add(panel);
        this.searchUI.getjPanel1().setVisible(true);
        this.searchUI.pack();
    }
}