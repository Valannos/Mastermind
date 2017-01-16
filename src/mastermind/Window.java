/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

/**
 *
 * @author vanel
 */
public class Window extends JFrame {
    
    
    public Window() {
        
        
       
        this.setTitle("Mastermind");
        this.setSize(400, 400);
        this.setLocation(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
       
        this.setContentPane(new Panel());
         this.setVisible(true);
        
    }
    
}
