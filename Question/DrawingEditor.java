import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.BorderLayout;

/**
 * Viewer class of the Drawing lab
 * Extends JFrame
 * set layout, create DrawingPanel, create ControlPanel, and create a JFrame
 * 
 * 
 */
public class DrawingEditor extends JFrame
{
    
    private final int WIDTH = 500;
    private final int HEIGHT = 500;
    
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
        BorderLayout layout = new BorderLayout(10,10);
        
        setLayout(layout);
        
        
        canvas = new DrawingPanel();
        controls = new ControlPanel(canvas);
        
        this.add(canvas,layout.CENTER);
        this.add(controls,layout.SOUTH);
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
