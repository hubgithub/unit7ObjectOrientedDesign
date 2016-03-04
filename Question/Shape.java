
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
/**
 * Write a description of class Shape here.
 * abstract class
 * Abstract methd: boolean isInside, void draw
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Shape
{
    // instance variables - replace the example below with your own
    private double radius;
    private Color color;
    private Point2D.Double center;

    /**
     * Constructor for objects of class Shape
     * initialize:
     *  double radius
     *  Color color
     *  Point2D.Double center
     */
    public Shape(Point2D.Double center,double radius,Color color)
    {
        // initialise instance variables
        this.center = center;
        this.radius = radius;
        this.color = color;
    }
    
    /**
     * 
     * return center
     */
    public Point2D.Double getCenter()
    {
        return this.center;
    }
    
    /**
     * return radius
     */
    public double getRadius()
    {
        return this.radius;
    }
    
    /**
     * 
     * move center to a certain location
     */
    public void move(double x, double y)
    {
        this.center.setLocation(x,y);
    }
    
    /**
     * change radius
     */
    public void setRadius(double r)
    {
        this.radius = r;
    }
    
    /**
     * get color
     */
    public Color getColor()
    {
        return color;
    }
    
    /**
     * abstract method, return what type of shape is this
     */
    public abstract String getType();

    /**
     * abstract method
     */
    public abstract boolean equals(Shape com_shape);

    /**
     * Abstract Method
     * check if a point is inside the shape
     */
    public abstract boolean isInside(Point2D.Double point);
    
    /**
     * Abstract Method
     * if filled is true: draw and fill the shape with color
     * else: draw the shape
     * 
     */
    public abstract void draw(Graphics2D g2, boolean filled);

    
}
