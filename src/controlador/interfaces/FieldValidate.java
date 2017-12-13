/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.interfaces;

/**
 *
 * @author emedina
 */
public interface FieldValidate {
    
    public abstract boolean validateNotEmptyFields();
    public abstract boolean validateRequiredFilds();
}
