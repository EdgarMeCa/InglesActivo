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
import vista.TeacherABC;
import modelo.dao.LoginDao;
import modelo.dao.impl.LoginDaoImpl;
/**
 *
 * @author emedina
 */
public class LoginControlador  {
    private Login loginUI;

    public LoginControlador(Login loginUI) {
        this.loginUI = loginUI;
    }

    /**
     *
     */
    public void doLogin() {
        if(true/*validateRequiredFilds()*/)
        {
            LoginDao loginDao = new LoginDao(loginUI.getjTextUsername().getText(),loginUI.getjTextPassword().getText());
            LoginDaoImpl loginDaoImpl = new LoginDaoImpl();
            
            boolean loginSuccessful = true;//loginDaoImpl.loginUser(loginDao);
            
            if (loginSuccessful)
            {
                TeacherABC teacherAbc = new TeacherABC();
                teacherAbc.setVisible(true);
                loginUI.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(loginUI, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);   
            }
        }
    }
}
