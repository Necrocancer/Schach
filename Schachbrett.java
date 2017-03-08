import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
/**
 * Write a description of class Schachbrett here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Schachbrett
{

    private JFrame fenster;
    private ArrayList<Felder> felder;
    private JPanel schachbrett;

    public Schachbrett(){
        felder = new ArrayList<Felder>();
        fensterAnzeigen();
    }

    public void fensterAnzeigen(){
        fenster = new JFrame("Schachbrett");
        Container contentPane = fenster.getContentPane();
        JMenuBar menubar = new JMenuBar();
        fenster.setJMenuBar(menubar);
        JMenu neu = new JMenu("Neu");
        menubar.add(neu);

        JMenuItem start = new JMenuItem("Start");
        start.addActionListener(new ActionListener(){

                public void actionPerformed(ActionEvent e){
                    
                }

            });

        neu.add(start);
        schachbrett = new JPanel(new GridLayout(8,8));
        JPanel numbers = new JPanel(new GridLayout(8,0));
        numbers.add(new JLabel("    1   "));
        numbers.add(new JLabel("    2   "));
        numbers.add(new JLabel("    3   "));
        numbers.add(new JLabel("    4   "));
        numbers.add(new JLabel("    5   "));
        numbers.add(new JLabel("    6   "));
        numbers.add(new JLabel("    7   "));
        numbers.add(new JLabel("    8   "));

        contentPane.add(numbers, BorderLayout.WEST);

        JPanel letters = new JPanel(new GridLayout(0,9));
        letters.add(new JLabel(""));
        letters.add(new JLabel("A"));
        letters.add(new JLabel("B"));
        letters.add(new JLabel("C"));
        letters.add(new JLabel("D"));
        letters.add(new JLabel("E"));
        letters.add(new JLabel("F"));
        letters.add(new JLabel("G"));
        letters.add(new JLabel("H"));
        contentPane.add(letters, BorderLayout.SOUTH);
        contentPane.add(schachbrett, BorderLayout.CENTER);
        
        
        //Timer
        JPanel timerpanel = new JPanel(new GridLayout(2,0));
        timerpanel.add(new JLabel("Timer:\n"));
        JButton reset = new JButton("Reset");
        reset.addActionListener(new ActionListener(){
           
            public void actionPerformed(ActionEvent e){
                
            }
            
        });
        timerpanel.add(reset);
        contentPane.add(timerpanel, BorderLayout.EAST);
        


        fenster.setSize(800, 800);
        fenster.setResizable(false);
        fenster.setVisible(true);
    }

    public void addFelder(Felder felder){
        this.felder.add(felder);
    }

    public void felderSetColour(int index, Color farbe){
        felder.get(index).buttonSetColor(farbe);
    }

    public void schachbrettAnzeigen(Color hell,Color dunkel){
        int counter = 0;
        boolean farbe = true;
        int counter_color = 0;
        if(counter < 64){
            for(Felder feld : felder){

                if(farbe && counter_color < 7){
                    feld.buttonSetColor(hell);
                    farbe = false;

                }
                else if(!farbe && counter_color <7){
                    feld.buttonSetColor(dunkel);
                    farbe = true;
                }
                else if(farbe && counter_color >= 7){
                    feld.buttonSetColor(hell);
                    farbe = true;
                    counter_color = -1;
                }
                else if(!farbe && counter_color >=7){
                    feld.buttonSetColor(dunkel);
                    farbe = false;
                    counter_color = -1;
                }

                schachbrett.add(feld.getButton());
                counter_color++;
                counter++;
            }
        }

    }

}
