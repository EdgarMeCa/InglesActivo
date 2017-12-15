/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.interfaces.FieldValuable;
import javax.swing.text.JTextComponent;
import javax.swing.JOptionPane;
import vista.Login;
/**
 *
 * @author emedina
 */
public class LoginControlador implements FieldValuable{
    private Login login = null;
    
    public LoginControlador() {
       
    }

    public LoginControlador(Login login) {
        this.login = login;
    }

    /**
     *
     */
    @Override
    public void validateRequiredFilds() {
        String message = null;
        if (validateNotEmptyField(login.getjTextUsername()))
        {
            message = "El campo usuario no puede estar vacio. \n";
        }
        if (validateNotEmptyField(login.getjTextPassword()))
        {
            message = "El campo contraseña no puede estar vacio. \n";
        }
        showMessage(message);
    }

    /**
     *
     * @param component
     * @return
     */
    @Override
    public boolean validateNotEmptyField(JTextComponent component) {
       return !component.getText().isEmpty();
    }
    
    /**
     *
     * @param message
     */
    @Override
    public void showMessage(String message){
        if(message != null)
        {
           JOptionPane.showMessageDialog(login, message, "Warning message", JOptionPane.WARNING_MESSAGE);
        }
    }
}
