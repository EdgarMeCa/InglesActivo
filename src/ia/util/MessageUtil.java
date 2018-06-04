/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia.util;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class MessageUtil {

    private MessageUtil() {
        
    }
    
    /**
     *
     */
    public static void databaseInsertErrorMessage() {
        JOptionPane.showMessageDialog(null,"Fallo al realizar el nuevo registro","Error",JOptionPane.ERROR_MESSAGE);
    } 
    
    /**
     *
     */
    public static void databaseInsertSuccessMessage() {
        JOptionPane.showMessageDialog(null,"Se ha realizado un nuevo registro","Exito",JOptionPane.INFORMATION_MESSAGE);
    } 
     
    /**
     *
     */
    public static void logingError(){
        JOptionPane.showMessageDialog(null, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     *
     * @param message
     */
    public static void customErrorMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     *
     * @param message
     */
    public static void customSuccessMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Exito", JOptionPane.INFORMATION_MESSAGE);
    }
}