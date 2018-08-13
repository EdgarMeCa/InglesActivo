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
    
    final static private String ERROR = "Error";
    final static private String EXITO = "Exito";

    private MessageUtil() {
        
    }
    
    /**
     *
     */
    public static void databaseInsertErrorMessage() {
        JOptionPane.showMessageDialog(null,"Fallo al realizar el nuevo registro",ERROR,JOptionPane.ERROR_MESSAGE);
    } 
    
    /**
     *
     */
    public static void databaseInsertSuccessMessage() {
        JOptionPane.showMessageDialog(null,"Se ha realizado un nuevo registro",EXITO,JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     *
     */
    public static void databaseUpdateErrorMessage() {
        JOptionPane.showMessageDialog(null,"Fallo al realizar la actualizacion del registro",ERROR,JOptionPane.ERROR_MESSAGE);
    } 
    
    /**
     *
     */
    public static void databaseUpdateSuccessMessage() {
        JOptionPane.showMessageDialog(null,"Se ha actualizado correctamente el registro",EXITO,JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     *
     */
    public static void databaseDeleteErrorMessage() {
        JOptionPane.showMessageDialog(null,"Fallo al eliminar el registro",ERROR,JOptionPane.ERROR_MESSAGE);
    } 
    
    /**
     *
     */
    public static void databaseDeleteSuccessMessage() {
        JOptionPane.showMessageDialog(null,"Se ha eliminado correctamente el registro",EXITO,JOptionPane.INFORMATION_MESSAGE);
    }
     
    /**
     *
     */
    public static void logingError(){
        JOptionPane.showMessageDialog(null, "Credenciales incorrectas", ERROR, JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     *
     * @param message
     */
    public static void customErrorMessage(String message) {
        JOptionPane.showMessageDialog(null, message, ERROR, JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     *
     * @param message
     */
    public static void customSuccessMessage(String message) {
        JOptionPane.showMessageDialog(null, message, EXITO, JOptionPane.INFORMATION_MESSAGE);
    }
}