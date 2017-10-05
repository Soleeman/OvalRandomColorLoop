/*
 * Soleeman Hakimi
 * October 4th 2017
 * ICS 4U
 */
//Importing All the Pakages
package drawovaltest;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;

/**
 *
 * @author sohak9660
 */

public class DrawOval extends JPanel
{
 
 
    Random rand = new Random();//Random Color Generated
    
   public void paintComponent(Graphics g)
   {
       
      super.paintComponent(g);
      Color colourRandom = randomColour();//Calling The Method Random Color

      g.setColor(colourRandom);//Set color 1
      g.fillOval(10, 10, 200, 200);//1st Oval
      
      Color colourRandom1 = randomColour();//Set color 2
      g.setColor(colourRandom1);//Use Color 2
      g.fillOval(20, 20, 180, 180);//2nd Oval
      
      g.setColor(colourRandom);//Use Color 1
      g.fillOval(30, 30, 160, 160);//3rd Oval
      
      g.setColor(colourRandom1);//Use Color 2
      g.fillOval(40, 40, 140, 140);//4th Oval
      
      g.setColor(colourRandom);//Use Color 1
      g.fillOval(50, 50, 120, 120);//5th Oval
      
      g.setColor(colourRandom1);//Use Color 2
      g.fillOval(60, 60, 100, 100);//6th Oval
      
      g.setColor(colourRandom);//Use Color 1
      g.fillOval(70, 70, 80, 80);//7th Oval
      
      g.setColor(colourRandom1);//Color 2
      g.fillOval(80, 80, 60, 60);//8th Oval
      
      g.setColor(colourRandom);//Color 1
      g.fillOval(90, 90, 40, 40);//9th Oval
      
      g.setColor(colourRandom1);//Color 2
      g.fillOval(100, 100, 20, 20);//10th Oval
      
      
      
     
      
}
/**
 * Creates a new color everytime 
 * Postcondition Returns a Random Generated Color
 * @return A random Color 
 */
private static Color randomColour(){
Random rand = new Random();//Random Number Generator
float r = rand.nextFloat();//Random Red Color
float g = rand.nextFloat();//Random Green Color
float b = rand.nextFloat();//Random Blue Color

Color randomColor = new Color(r, g, b);//Creates a New Color
       

return randomColor;//Returns the Color

 
}}