/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia.util;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
/**
 *
 * @author ASUS
 */
public class Picture extends JPanel {
    private final String path;
    private final int width;
    private final int heigth;
    
    private BufferedImage image;
    
    /**
     *
     * @param width
     * @param heigth
     * @param path
     */
    public Picture(int width, int heigth, String path) {
        this.width = width;
        this.heigth = heigth;
        this.path = path;
        initComponents();
    }
    
    @Override
    public void paint(Graphics g) {
        g.drawImage(image,0,0, null);
        this.setOpaque(false);
        super.paintComponent(g);
    }
    
    private void initComponents() {
        this.setSize(width, heigth);
        this.setBackground(Color.WHITE);
        loadImage();
    }
    
    private void loadImage() {
        try
        {
            if(path != null)
            {
                image = ImageIO.read(new File(path));
            }
            else
            {
                image = null;
            }
        }
        catch (IOException ex) 
        {
            ex.printStackTrace();
        }
    }
}