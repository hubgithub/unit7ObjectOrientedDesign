import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
/**
 * extends abstract class Shape
 * Override abstract methd: boolean isInside,void draw
 * A square shape
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Shape
{
    
    private Rectangle rect;

    

    /**
     * Constructor for objects of class Square
     * 
     */
    public Square(Point2D.Double location, double radius,Color color)
    {
        super(location,radius,color);

        rect = new Rectangle((int)location.getX(),(int)location.getY(),(int)radius,(int)radius);
    }

    
    
    /**
     * Check if a point is inside the square
     */
    public boolean isInside(Point2D.Double point)
    {
        double point_x = point.getX();
        double point_y = point.getY();
        
        double x = super.getCenter().getX();
        double y = super.getCenter().getY();
        
        double x_right = x + super.getRadius();
        double y_down = y + super.getRadius();
        
        if((point_x < x_right && point_x > x) && (point_y < y_down && point_y > y))
        {
            return true;
        }
        
        return false;
    }
    

    /**
     * draw the square
     */
    public void draw(Graphics2D g2, boolean filled)
    {
        g2.setColor(super.getColor());
        g2.draw(rect);
        if(filled)
        {
            g2.fill(rect);
        }
        
        
    }

}


// 
//     public boolean inOnBorder(Point2D.Double point)
//     {
//         double point_x = point.getX();
//         double point_y = point.getY();
//         
//         double x = location.getX();
//         double y = location.getY();
//         
//         double x_right = x + width;
//         double y_down = y + height;
//         // need fix
//         if((point_x < x_right && point_x > x) && (point_y < y_down && point_y > y))
//         {
//             return true;
//         }
//         return false;
//         
//         
//         
