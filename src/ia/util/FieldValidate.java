/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia.util;

import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

/**
 *
 * @author emedina
 */
public class FieldValidate {
    
    /**
     *
     * @return 
     */
    public boolean validateRequiredFilds() {
       return true;
    }

    /**
     *
     * @param component
     * @return
     */
    public boolean isFieldNotEmpty(JTextComponent component) {
       return !component.getText().isEmpty();
    }
    
    public boolean isNumberPhone(String value, int length) {
       return true; 
    }
    
    /**
     *
     * @param message
     */
    public void showMessage(String message){
        if(!message.isEmpty())
        {
           JOptionPane.showMessageDialog(null, message, "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
