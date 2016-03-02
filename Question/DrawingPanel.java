import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Shape;
import javax.swing.JColorChooser;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;


/**
 * Pick Color
 * Drawing and paint all the shapes
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel //implements MouseListener,MouseMotionListener
{
    
    private Color draw_color;
    ArrayList<Shape> shapes;
    private JColorChooser chooser;
    /**
     * Default constructor for objects of class DrawingPanel
     * initalize all the instance variables
     * set background color to white
     * set the canvas size
     */
    public DrawingPanel()
    {
        
        draw_color = new Color(67,198,219);
        this.setBackground(new Color(255,255,255));
        this.setSize(750,750);
        chooser = new JColorChooser(draw_color);
        
        
    }
    
    /**
     * pick a color
     */
    public void pickColor()
    {
        
        
        Color col = chooser.showDialog(this,"Any Color you like", draw_color);
        
        if(col != null)
        {
            draw_color = col;
        }
        

        
    }
    
    /**
     * create a new circle
     */
    public void addCircle()
    {
        
    }
    
    /**
     * creat a new square
     */
    public void addSquare()
    {
        
    }
    
    /**
     * paint the shape
     */
    public void paintComponent(Graphics g)
    {
        // and draw all the shape that in the list
        
        
        super.paintComponent(g);
        
    }
    
    /**
     * return current color
     */
    public Color getColor()
    {
        return draw_color;
    }


}
