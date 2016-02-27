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


/**
 * Write a description of class ControlPanel here.
 * 
 * extends JPanel
 * 
 * three buttons to it: ?Pick Color,? ?Add Circle,? and ?Add Square.?
 * 
 * @author (Heng Li) 
 * @version (2-23-2016)
 */
public class ControlPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    private JButton button_color;
    private JButton button_square;
    private JButton button_circle;

    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel()
    {
        // initialise instance variables
        
        

        button_color = new JButton("Pick Color");

        
        
        button_square = new JButton("Add Square");

        
        button_circle = new JButton("Add Circle");

        this.add(button_color);
        this.add(button_square);
        this.add(button_circle);
        
        
        
        
        
    }
    
    class ClickListener implements ActionListener
    {
        
        public void color_pick(ActionEvent event)
        {
            String which = event.getActionCommand();
            
            if(which == button_color.getName())
            {
                
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
