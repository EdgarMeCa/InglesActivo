/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia.util;

import javax.swing.JFileChooser;
/**
 *
 * @author emedina
 */
public class FileChooser {
    private final JFileChooser fileChooser; 

    /**
     *
     */
    public FileChooser() {
        fileChooser = new JFileChooser();
    }
    
    /**
     *
     * @return
     */
    public String getPath() {
        String path = "";
        int selected = fileChooser.showOpenDialog(null);
        if (selected == JFileChooser.APPROVE_OPTION) {
            path = fileChooser.getSelectedFile().getAbsolutePath();
        }
        return path;
    }
    
    
}
