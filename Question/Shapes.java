import java.awt.Shape;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
/**
 * Write a description of class Shape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Shapes implements Shape
{
    // instance variables - replace the example below with your own
    private double radius;
    private Color color;
    private Point2D.Double center;

    /**
     * Constructor for objects of class Shape
     */
    public Shapes(Point2D.Double center,double radius,Color color)
    {
        // initialise instance variables
        this.center = center;
        this.radius = radius;
        this.color = color;
    }
    
    public Point2D.Double getCenter()
    {
        return this.center;
    }
    
    public double getRadius()
    {
        return this.radius;
    }
    
    public void move(double x, double y)
    {
        this.center.setLocation(x,y);
    }
    
    public void setRadius(double r)
    {
        this.radius = r;
    }
    
    public boolean isInside(Point2D.Double point)
    {
        double x_negative = center.getX() - radius;
        double x_positive = center.getX() + radius;
        
        double y_negative = center.getY() - radius;
        double y_positive = center.getY() + radius;
        
        double x = point.getX();
        double y = point.getY();
        
        if((x < x_negative || x > x_positive) || (y < y_negative || y > y_positive))
        {
            return false;
        }
        
        return true;
    }
    
    public boolean isOnBorder(Point2D.Double point)
    {
        double x_negative = center.getX() - radius;
        double x_positive = center.getX() + radius;
        
        double y_negative = center.getY() - radius;
        double y_positive = center.getY() + radius;
        
        double x = point.getX();
        double y = point.getY();
        if((x == x_negative || x == x_positive) || (y == y_negative || y == y_positive))
        {
            return false;
        }
        
        return true;        
        
    }

    public void draw(Graphics2D g2, boolean filled)
    {
        if(filled)
        {
            g2.draw(this);
            g2.fill(this);
        }
        else
        {
            g2.draw(this);
        }
        
        
    }
    
}
