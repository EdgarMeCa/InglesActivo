/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia.util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author emedina
 */
public class UI_Helper {
    
    /**
     *
     * @param combo
     * @return
     */
    public static Object comboBoxToList(JComboBox combo) {
        List<Object> list = new ArrayList<>();
        int size = combo.getItemCount();
        for (int i = 0; i < size; i++) {
            list.add(combo.getItemAt(i));
        }
    return list;   
    }   
}