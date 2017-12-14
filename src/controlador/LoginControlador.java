/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.interfaces.FieldValidate;
import vista.Login;
/**
 *
 * @author emedina
 */
public class LoginControlador implements FieldValidate{
    private Login login = null;
    
    public LoginControlador() {
       
    }

    public LoginControlador(Login login) {
        this.login = login;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean validateRequiredFilds() {
        boolean result = true;
        if (login.getjTextUsername().getText().isEmpty())
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
