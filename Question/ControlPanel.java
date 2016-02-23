import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */


}
