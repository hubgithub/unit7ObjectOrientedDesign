import java.awt.Rectangle;
import java.awt.geom.Point2D;
/**
 * extends abstract class Shape
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Shape
{
    
    private Rectangle rect;
    private int width;
    private int height;
    private Point2D.Double location;
    

    /**
     * Constructor for objects of class Square
     */
    public Square(Point2D.Double location, int width, int height)
    {
        this.location = location;
        this.width = width;
        this.height = height;
        rect = new Rectangle(location.getX(),location.getY(),this.width,this.height);
    }

    /**
     * 
     * 
     */
    public int getWidth()
    {
        
        return this.width;
    }
    
    public void setWidth(int width)
    {
        this.width = width;
    }
    
    public int getHeight()
    {
        return this.height;
    }
    
    public void setHeight(int height)
    {
        this.height = height;
    }
    
    public boolean isInside(Point2D.Double point)
    {
        double point_x = point.getX();
        double point_y = point.getY();
        
        double x = location.getX();
        double y = location.getY();
        
        double x_right = x + width;
        double y_down = y + height;
        
        if((point_x < x_right && point_x > x) || (point_y < y_down && point_y > y))
        {
            return true;
        }
        return false;
    }
    
    public boolean inOnBorder(Point2D.Double point)
    {
        double point_x = point.getX();
        double point_y = point.getY();
        
        double x = location.getX();
        double y = location.getY();
        
        double x_right = x + width;
        double y_down = y + height;
        // need fix
        if((point_x < x_right && point_x > x) && (point_y < y_down && point_y > y))
        {
            return true;
        }
        return false;
        
        
        
    }

}
