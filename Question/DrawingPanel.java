import javax.swing.JPanel;
import java.awt.geom.Point2D;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.lang.Math;
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
public class DrawingPanel extends JPanel 
{
    
    private Color draw_color;
    private ArrayList<Shape> shapes;
    private Shape activeShape;
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
        this.setSize(480,480);
        chooser = new JColorChooser(draw_color);
        shapes = new ArrayList<Shape>();
        
        Listener listener = new Listener();
        MotionListener motionListener = new MotionListener();
        this.addMouseListener(listener);
        this.addMouseMotionListener(motionListener);
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
     * add square to shapes
     */
    public void addCircle()
    {
        int randX = (int)(Math.random()*400);
        int randY = (int)(Math.random()*400);
        Point2D.Double center = new Point2D.Double(randX,randY);
        
        Shape circle = new Circle(center,20,draw_color);
        
        activeShape = circle;
        shapes.add(circle);
    }
    
    /**
     * creat a new square
     * add square to shapes
     */
    public void addSquare()
    {
        int randX = (int)(Math.random()*400);
        int randY = (int)(Math.random()*400);
        Point2D.Double center = new Point2D.Double(randX,randY);
        
        Shape square = new Square(center,20,draw_color);
        
        activeShape = square;
        shapes.add(square);
    }
    
    /**
     * return current color
     */
    public Color getColor()
    {
        return draw_color;
    }    
    
    /**
     * paint the shape
     */
    public void paintComponent(Graphics g)
    {
        // and draw all the shape that in the list
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        
        for(Shape shape : shapes)
        {
            
            shape.draw(g2,!(activeShape == shape));
        }
        repaint();
        
    }
    

    
    class Listener implements MouseListener
    {
        
        public void mouseClicked(MouseEvent e)
        {
        }
        

        
        public void mouseExited(MouseEvent e){}

        
        public void mousePressed(MouseEvent e)
        {
            
            boolean x = false;
            for(Shape shape : shapes)
            {
                if(shape.isInside(new Point2D.Double(e.getX(),e.getY())))
                {
                    x = true;
                    activeShape = shape;

                }
            }
            
            if(!x)
            {
                activeShape = null;
            }
            
            repaint();            
        }
        
        public void mouseReleased(MouseEvent e){}
        
        public void mouseEntered(MouseEvent e){}
        
        public void moseExited(MouseEvent e){}
        
    }
    
    class MotionListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent e)
        {

            if(activeShape != null)
            {
                activeShape.move(e.getX(),e.getY());
                repaint();            
            }

            
        }  
        
        public void mouseMoved(MouseEvent e)
        {
       
        }        
    }
}

