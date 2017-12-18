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
import controlador.interfaces.Executable;
import modelo.dao.LoginDao;
import modelo.dao.impl.LoginDaoImpl;
/**
 *
 * @author emedina
 */
public class LoginControlador implements FieldValuable,Executable{
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
        String message = "";
        boolean result = true;
        if (!validateNotEmptyField(login.getjTextUsername()))
        {
            message += "El campo usuario no puede estar vacio. \n";
            result = false;
        }
        if (!validateNotEmptyField(login.getjTextPassword()))
        {
            message += "El campo contraseña no puede estar vacio. \n";
            result = false;
        }
        showMessage(message);
        return result;
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
        if(!message.isEmpty())
        {
           JOptionPane.showMessageDialog(login, message, "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    @Override
    public void doAction() {
        if(validateRequiredFilds())
        {
            LoginDao loginDao = new LoginDao(login.getjTextUsername().getText(),login.getjTextPassword().getText());
            LoginDaoImpl loginDaoImpl = new LoginDaoImpl();
            
            boolean loginSuccessful = loginDaoImpl.loginUser(loginDao);
            
            if (loginSuccessful)
            {
                
            }
            else
            {
                JOptionPane.showMessageDialog(login, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);   
            }
        }
    }
}
