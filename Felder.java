import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class Felder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Felder
{

    private JButton button;
    
    
    public Felder()
    {
        button = new JButton();
    }
    
    public void buttonSetColor(Color farbe){
        button.setBackground(farbe);
    }
    
    public JButton getButton(){
        return button;
    }



}
