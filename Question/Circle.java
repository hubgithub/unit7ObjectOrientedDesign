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
        
        double x2_x = point.getX() - x;
        double y2_y = point.getY() - y;
        
        double distance = Math.sqr(Math.pow(x2_x,2)+Math.pow(y2_y,2));
        
    
    
        
        
        if(distance > radius)
        {
            return false;
        }
        
        return true;
                
    }
    
    public draw();
}
