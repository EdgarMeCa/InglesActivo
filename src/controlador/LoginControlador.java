/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import ia.util.ResultMessage;
import javax.swing.JOptionPane;
import vista.LoginUI;
import modelo.dao.LoginDao;
import modelo.dao.impl.LoginDaoImpl;
import vista.PrincipalUI;
/**
 *
 * @author emedina
 */
public class LoginControlador  {
    private LoginUI loginUI;

    public LoginControlador(LoginUI loginUI) {
        this.loginUI = loginUI;
    }

    /**
     *
     */
    public void doLogin() {
        if(validateFields())
        {
            LoginDao loginDao = new LoginDao(loginUI.getjTextUsername().getText(),loginUI.getjTextPassword().getText());
            LoginDaoImpl loginDaoImpl = new LoginDaoImpl();
            
            boolean loginSuccessful = true;//loginDaoImpl.loginUser(loginDao);
            
            if (loginSuccessful)
            {
                PrincipalUI p = new PrincipalUI();
                p.setVisible(true);
                loginUI.setVisible(false);
            }
            else
            {
                ResultMessage.logingFail();
            }
        }
        else 
        {
            messageEmptyFilds();
        }
    }
    
    private boolean validateFields() {
        if(loginUI.getjTextUsername().getText().isEmpty() || loginUI.getjTextPassword().getText().isEmpty()){
            return false;
        }
        return true;
    }
    
    private void messageEmptyFilds(){
        if(loginUI.getjTextUsername().getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"El campo usuario no puede estar vacio","Error",JOptionPane.ERROR_MESSAGE);
        }
        if(loginUI.getjTextPassword().getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"El campo contraseña no puede estar vacio","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}