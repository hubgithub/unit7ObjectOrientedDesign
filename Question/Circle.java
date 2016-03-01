import java.awt.geom.Point2D;
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    // instance variables - replace the example below with your own
    
    public boolean isInside(Point2D.Double point)
    {
        {
            double x_negative = center.getX() - radius;
            double x_positive = center.getX() + radius;
            
            double y_negative = center.getY() - radius;
            double y_positive = center.getY() + radius;
            
            double x = point.getX();
            double y = point.getY();
            
            if((x < x_negative && x > x_positive) || (y < y_negative && y > y_positive))
            {
                return false;
            }
            
            return true;
        }        
    }
    
}
