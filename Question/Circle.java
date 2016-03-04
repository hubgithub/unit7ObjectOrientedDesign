import java.awt.geom.Point2D;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    // instance variables - replace the example below with your own
    private Ellipse2D.Double elli;
    private String type;
    
    public Circle(Point2D.Double center,double radius,Color color)
    {
        super(center,radius,color);
        
        type = "Circle";
        elli = new Ellipse2D.Double(center.getX(),center.getY(),radius*2,radius*2);
    }
    
    public boolean isInside(Point2D.Double point)
    {
        
        Point2D.Double center = super.getCenter();
        
        double x2_x = point.getX() - center.getX();
        double y2_y = point.getY() - center.getY();
        
        double distance = Math.sqrt(Math.pow(x2_x,2) + Math.pow(y2_y,2));

        if(distance > super.getRadius())
        {
            return true;
        }
        
        return false;
                
    }
    
    public void draw(Graphics2D g2, boolean filled)
    {
        g2.setColor(super.getColor());
        g2.draw(elli);
        
        if(filled)
        {
            
            g2.fill(elli);
        }
        
        
    }
    
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
