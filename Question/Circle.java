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
    private double radius;
    private Color color;
    private Ellipse2D.Double elli;
    private Point2D.Double center;
    
    public Circle(Point2D.Double center,double radius,Color color)
    {
        super(center,radius,color);
        
        //this.center = center;
        
        //this.radius = radius;
        //this.color = color; 
        //elli = new Ellipse2D.Double(center.getX(),center.getY(),radius*2,radius*2);
    }
    
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
