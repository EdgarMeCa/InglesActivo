/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.interfaces.FieldValidate;
import javax.swing.JTextField;
/**
 *
 * @author emedina
 */
public class LoginControlador implements FieldValidate{
    
    private JTextField username = null;
    private JTextField password = null;

    public LoginControlador() {
        
    }

    public LoginControlador(JTextField username, JTextField password) {
        this.username = username;
        this.password = password;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean validateRequiredFilds() {
        boolean result = true;
        if (username.getText().isEmpty() || password.getText().isEmpty())
        {
            result = false;
        }
        return result;
    }

    @Override
    public boolean validateNotEmptyFields() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
