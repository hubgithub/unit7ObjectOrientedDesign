import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.BorderLayout;

/**
 * Extends JFrame
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingEditor extends JFrame
{
    
    private final int WIDTH = 800;
    private final int HEIGHT = 800;
    
    private ControlPanel controls;
    private DrawingPanel canvas;

    /**
     * Default constructor for objects of class DrawingEditor
     * 
     * Create frame, setSize, set title to the window
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
     * main methed, creat a DrawingEditor and run
     */
    public static void main(String []args)
    {
        DrawingEditor dra = new DrawingEditor();
    }

}
