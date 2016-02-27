import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.BorderLayout;

/**
 * Write a description of class DrawingEditor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingEditor extends JFrame
{
    /** description of instance variable x (add comment for each instance variable) */
    private final int WIDTH = 800;
    private final int HEIGHT = 800;
    
    private ControlPanel controls;
    private DrawingPanel canvas;

    /**
     * Default constructor for objects of class DrawingEditor
     * 
     * Create frame, setSize, Create a title
     */
    public DrawingEditor()
    {
        // initialise instance variables
        super("DrawingEditor");
        BorderLayout layout = new BorderLayout(10,195);
        
        setLayout(layout);
        
        
        
        ControlPanel control = new ControlPanel();
        this.add(control,layout.SOUTH);
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
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
    public static void main(String []args)
    {
        DrawingEditor dra = new DrawingEditor();
    }

}
