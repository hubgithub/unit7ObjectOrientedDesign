import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.geom.Line2D;

/**
 * Write a description of class Triangle here.
 * 
 * @author (Hello Hi) 
 * @version (20016)
 */
public class TriangleComponent extends JComponent
{
    private static Graphics2D graph;
    private int[][] points = new int[3][2];
    private int click_count = 0;
    private Rectangle rect;
    
    public TriangleComponent()
    {
        rect = new Rectangle(0,0,1,1);
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D graph = (Graphics2D) g;
        Line2D line = new Line2D();
        
        if(click_count == 1)
        {
            graph.draw(rect);
        }
        else if(click_count == 2)
        {
            line.Double(points[0][0],points[1][0],points[0][1],points[1][1]);
        }
        else if(click_count == 3)
        {
            line.Double(points[0][0],points[1][0],points[0][1],points[1][1]);
            line.Double(points[2][0],points[2][0],points[0][0],points[0][1]); 
            line.Double(points[0][0],points[1][0],points[0][1],points[1][1]);
        }
        
        graph.draw(rect);
        
    }
    
    public void addPoint(int x, int y)
    {
        
        points[click_count][0] = x;
        points[click_count][1] = y;
        rect.setLocation(x,y);
        
        click_count++;
        if(click_count > 3)
        {
            click_count = 0;
        }
    }


}




