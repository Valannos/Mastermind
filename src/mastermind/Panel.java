/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author vanel
 */
public class Panel extends JPanel{
    
    public void paintComponent(Graphics g) {
        
        System.out.println("Je suis executé");
               
        
        g.fillOval(this.getWidth()/2, this.getHeight()/2, this.getWidth()/10, this.getHeight()/10);
        
        g.drawRect(this.getWidth()/4, this.getHeight()/4, this.getWidth()/2, this.getHeight()/2);
        
        g.drawLine(0, 0, this.getWidth(), this.getHeight());
   
        
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(java.awt.Color.red);
        g.drawString("Hello", 20, 30);
        
    }
    
}
