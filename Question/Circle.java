import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
/**
 * extends abstract class Shape
 * Override abstract method: String getType(), boolean equals, boolean isInside, void draw
 * Create a Circle shape
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    // instance variables - replace the example below with your own
    private Ellipse2D.Double elli;
    private String type;
    
    /**
     * call super class constructor
     * initialize Ellipse2D
     */
    public Circle(Point2D.Double center,double radius,Color color)
    {
        super(center,radius,color);
        
        type = "Circle";
        elli = new Ellipse2D.Double(center.getX(),center.getY(),radius*2,radius*2);
    }
    
    /**
     * Overrided abstract method, return true if the point is inside circle
     */
    public boolean isInside(Point2D.Double point)
    {
        
        
        elli = new Ellipse2D.Double(super.getCenter().getX(),super.getCenter().getY(),super.getRadius()*2,super.getRadius()*2);
        if(elli.contains(point.getX(),point.getY()))
        {

            return true;
        }
        
        return false;

        //Ellipse2D.Double circ = new Ellipse2D.Double(getCenter().getX())
                
    }
    
    /**
     * Draw the Ellipse2D to make a circle, if filled false not color the circle
     */
    public void draw(Graphics2D g2, boolean filled)
    {
        g2.setColor(super.getColor());
        
        elli = new Ellipse2D.Double(super.getCenter().getX(),super.getCenter().getY(),super.getRadius()*2,super.getRadius()*2);
        
        if(filled)
        {
            
            g2.fill(elli);
        }
        else
        {
            g2.draw(elli);
        }
        
    }
    
    /**
     * overrided abstract method, return a String of what type of the shape is
     */
    public String getType()
    {
        return type;
    }
    
    /**
     * return true if two shape are the same
     */
    public boolean equals(Shape com_shape)
        {
        String type = com_shape.getType();
        Point2D.Double point = com_shape.getCenter();
        if(super.getCenter().equals(point) && super.getColor().equals(com_shape.getColor()) && super.getRadius() == com_shape.getRadius() &&type.equals(com_shape.getType()))
        {
            return true;
        }
        return false;
    }
}
