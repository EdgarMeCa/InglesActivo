/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.interfaces;

import javax.swing.text.JTextComponent;
/**
 *
 * @author emedina
 */
public interface FieldValuable {
    
    public abstract boolean validateRequiredFilds();
    public abstract boolean validateNotEmptyField(JTextComponent component);
    public abstract void showMessage(String message);
}
