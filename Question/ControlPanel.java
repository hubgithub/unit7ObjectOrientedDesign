import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Rectangle;

/**
 * 
 * extends JPanel
 * Create buttons, and track of all mouse movement
 * 
 * 
 * @author (Heng Li) 
 * @version (2-23-2016)
 */
public class ControlPanel extends JPanel
{
    /** button_color: choose color button
        button_square: add a square
        button_circle: add a circle
        rect: display which color was selected
        */
    private JButton button_color;
    private JButton button_square;
    private JButton button_circle;
    private JPanel color_show;
    private DrawingPanel canvas;
    /**
     * Default constructor for objects of class ControlPanel
     * Creat three buttons: Pick Color, Add Square, Add Circle
     * after Pick Color a rectangle shows what color was chosen
     */
    public ControlPanel(DrawingPanel canvas_99)
    {
        // initialise instance variables
        
        this.canvas = canvas_99;

        button_color = new JButton("Pick Color");
        
        color_show = new JPanel();
        color_show.setBackground(canvas.getColor());
        
        button_square = new JButton("Add Square");

        
        button_circle = new JButton("Add Circle");

        this.add(button_color);
        this.add(color_show);
        this.add(button_square);
        this.add(button_circle);
        
        
        
        
        
    }
    
    /**
     * ClickListener, implements ActionListener
     * overide abstract method
     * check which button was clicked
     */
    class ClickListener implements ActionListener
    {
        
        /**
         * check which button was clicked and call DrawingPanel to act
         */
        public void actionPerformed(ActionEvent event)
        {
            //which button was cliked
            String which = event.getActionCommand();
            
            if(which == button_color.getName())
            {
                canvas.pickColor();
            }
            else if(which == button_square.getName())
            {
                
            }
            else if(which == button_circle.getName())
            {
                
            }
            
        }
        

        public void mouseReleased(MouseEvent event) {}
        
        public void mouseClicked(MouseEvent event) {}
        
        public void mouseEntered(MouseEvent event) {}
        
        public void mouseExited(MouseEvent event) {}
        
    }
    
    
    



}
