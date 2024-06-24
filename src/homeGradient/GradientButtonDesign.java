/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeGradient;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;

/**
 *
 * @author DELL
 */
public class GradientButtonDesign extends JButton{
    protected void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D)g.create();
        int w = getWidth();
        int h = getHeight();
        
        GradientPaint gp = new GradientPaint(0 , 0 , Color.LIGHT_GRAY , w , h , Color.cyan);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        super.paintComponent(g);
    }
}
