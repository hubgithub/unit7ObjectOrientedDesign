import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
/**
 * extends abstract class Shape
 * Override abstract methd: boolean isInside,void draw
 * A square shape
 */
public class Square extends Shape
{
    
    private Rectangle rect;
    private String type;
    

    /**
     * Constructor for objects of class Square
     * call super class constructor, create a Rectangle
     */
    public Square(Point2D.Double location, double radius,Color color)
    {
        super(location,radius,color);
        type = "Square";
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
            rect = new Rectangle((int)super.getCenter().getX(),(int)super.getCenter().getY(),(int)super.getRadius(),(int)super.getRadius());
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
    /**
     * return type
     */
    public String getType()
    {
        return type;
    }
    
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
