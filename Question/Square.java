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
    private double width;
    private double height;
    private Color color;
    private Point2D.Double location;
    

    /**
     * Constructor for objects of class Square
     * 
     */
    public Square(Point2D.Double location,Color color, double width,double height)
    {
        this.location = location;
        this.width = width;
        this.height = height;
        this.color = color;
        rect = new Rectangle(location.getX(),location.getY(),this.width,this.height);
    }

    /**
     * return the width of the square
     * 
     */
    public int getWidth()
    {
        
        return this.width;
    }
    
    /**
     * set the width of the square
     */
    public void setWidth(int width)
    {
        this.width = width;
    }
    
    /**
     * get the height of the square
     */
    public int getHeight()
    {
        return this.height;
    }
    
    /**
     * set the height of the square
     */
    public void setHeight(int height)
    {
        this.height = height;
    }
    
    /**
     * Check if a point is inside the square
     */
    public boolean isInside(Point2D.Double point)
    {
        double point_x = point.getX();
        double point_y = point.getY();
        
        double x = location.getX();
        double y = location.getY();
        
        double x_right = x + width;
        double y_down = y + height;
        
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
        g2.setColor(this.color);
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
