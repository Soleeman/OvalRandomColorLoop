/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Importing  The JFrame
package drawovaltest;
import javax.swing.JFrame;

/**
 *
 * @author sohak9660
 */
public class DrawOvalTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              DrawOval panel = new DrawOval();      
              JFrame application = new JFrame();
              
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.add(panel);
      application.setSize(230, 250);      
      application.setVisible(true);
             
    }
    
}
