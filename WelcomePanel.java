/**
* Project: PIXEL PLAYER
* File: WelcomePanel.java
* Written by: Shannon Brown
* Description: This panel is the first to pop up when the GUI opens. It includes
* instructions on how to use the Pixel Player
* 
* @author Shannon Brown, Caitlin Coyiuto, Adri Tan
* @since 2016-05-08
*/

import java.awt.*;

import javax.swing.*;

public class WelcomePanel extends JPanel
  
{
  /**
   * WelcomePanel() class which is the first panel to pop up when the GUI opens
   * and it includes the instructions on how to use the Pixel Player.
   */
   
  public WelcomePanel()
    
  {
    
    setBackground (Color.decode("#212121")); //dark grey
    setPreferredSize(new Dimension(600,600));
    
    
    ImageIcon intro = new ImageIcon ("PixelPlayerIntro.png"); //image that contains all of the information
    //we made this an image to have a consistent font no matter what type of the computer the user is on
    JLabel imageLabel = new JLabel (intro);
    //add the image to the panel
    add(imageLabel);
    
    
  }
  
}