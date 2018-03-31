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
public class ResultMessage {
    
    public static void databaseInsertFailMessage() {
        JOptionPane.showMessageDialog(null,"Error\n" + "Fallo al realizar el nuevo registro");
    } 
    
     public static void databaseInsertSuccessMessage() {
        JOptionPane.showMessageDialog(null,"Se ha realizado un nuevo registro","Exito",JOptionPane.INFORMATION_MESSAGE);
    } 
     
    public static void logingFail(){
        JOptionPane.showMessageDialog(null, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
