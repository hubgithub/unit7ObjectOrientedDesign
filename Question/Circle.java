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
        
        double x2_x = point.getX() - super.getX();
        double y2_y = point.getY() - super.getY();
        
        double distance = Math.sqrt(Math.pow(x2_x,2)+Math.pow(y2_y,2));


        
        if((Math.sqrt(Math.pow(point.getX() - super.getCenter().getX(),2) + Math.pow(point.getY() - super.getCenter().getY(),2))) > super.getRadius())
        {
            System.out.println("Point is in the circle!!!");
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
        g2.draw(elli);
        
        if(filled)
        {
            
            g2.fill(elli);
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