import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class Figuren here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Figuren extends Felder
{

    private JButton button;

    public Figuren(){
        
    }
    
    public abstract void interact();

}
