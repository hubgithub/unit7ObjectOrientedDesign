import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.Shape;
import javax.swing.JColorChooser;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;


/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel //implements MouseListener,MouseMotionListener
{
    /** description of instance variable x (add comment for each instance variable) */
    private Color draw_color;
    ArrayList<Shape> shapes;

    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        
        draw_color = new Color(67,198,219);
        this.setBackground(new Color(255,255,255));
        this.setSize(750,750);
        
        
        
    }
    
    public void pickColor()
    {
        JColorChooser chooser = new JColorChooser(draw_color);
        
        draw_color = chooser.getColor();
        
    }
    
    public void addCircle()
    {
        
    }
    
    public void addSquare()
    {
        
    }
    
    public void paintComponent(Graphics g)
    {
        
    }
    
    public Color getColor()
    {
        return draw_color;
    }


}