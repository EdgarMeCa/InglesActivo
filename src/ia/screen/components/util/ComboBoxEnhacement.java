/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia.screen.components.util;
 
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel; 
import javax.swing.JComboBox;

/**
 *
 * @author EMEDINA
 * @param <T>
 */
public class ComboBoxEnhacement<T> {
    
    /**
     *
     * @param list
     * @return
     */
    public DefaultComboBoxModel fillComboBox(List<T> list) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for(T object : list){
            model.addElement(object);
        }
        return model;
    }   
    
    /**
     *
     * @param combo
     * @return
     */
    public List<T> comboBoxToList(JComboBox combo) {
        List<T> list = new ArrayList<>();
        int size = combo.getItemCount();
        for (int i = 0; i < size; i++) {
            list.add((T)combo.getItemAt(i));
        }
    return list;   
    }   
}