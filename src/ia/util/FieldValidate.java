/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia.util;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.util.regex.*;

/**
 *
 * @author emedina
 */
public class FieldValidate {

    private FieldValidate() {
        
    }
    
    /**
     *
     * @param component
     * @return
     */
    public static boolean isFieldNotEmpty(JTextField component) {
       return !component.getText().isEmpty();
    }
    
    /**
     *
     * @param component
     * @return
     */
    public static boolean isFieldNotEmpty(JTextArea component) {
       return !component.getText().isEmpty();
    }
    
    /**
     *
     * @param value
     * @return
     */
    public static boolean isPhoneNumber(String value) {
        Pattern p = Pattern.compile("^(?:\\+|-)?\\d+$");
        Matcher m = p.matcher(value);
        return m.find();
    }
    
    /**
     *
     * @param value
     * @return
     */
    public static boolean isEmail(String value) {
        Pattern p = Pattern.compile("^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$");
        Matcher m = p.matcher(value);
        return m.matches();
    }
}