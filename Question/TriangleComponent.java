import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.Rectangle;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.geom.Line2D;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Triangle Component
 * get x,y from Listener, and draw lines
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
    

    /**
     * Construtor, create a point
     */
    public TriangleComponent()
    {
        rect = new Rectangle(0,0,1,1);
        
        addMouseListener(new Triangle_Listener());
    }
    
    /**
     * Draw lines
     */
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        Graphics2D graph = (Graphics2D) g;
        
        if(click_count == 1)
        {
            graph.draw(rect);
        }
        else if(click_count == 2)
        {
            graph.draw(new Line2D.Double(points[0][0],points[0][1],points[1][0],points[1][1]));
        }
        else if(click_count == 3)
        {
            graph.draw(new Line2D.Double(points[0][0],points[0][1],points[1][0],points[1][1]));
            graph.draw(new Line2D.Double(points[1][0],points[1][1],points[2][0],points[2][1])); 
            graph.draw(new Line2D.Double(points[2][0],points[2][1],points[0][0],points[0][1]));
        }
        
        System.out.println(click_count);
        graph.draw(rect);
        repaint();
        
    }
    

    
    /**
     * set the point location
     */
    public void addPoint(int x, int y)
    {
        
 
        points[click_count][0] = x;
        points[click_count][1] = y;
        
        rect.setLocation(x,y);
        
        
        if(click_count > 3)
        {
            click_count = 0;
        }
        
        
        this.repaint();
        
        click_count++;
        
        repaint();
    }
    
        public int getClick_count()
    {
        return click_count;
    }
    
    
<<<<<<< HEAD
    
=======
    class Triangle_Listener implements MouseListener
    
    {
        
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            if(click_count <= 3)
            {    
                
                addPoint(x,y);
            }
            
        }
        
        public void mouseReleased(MouseEvent event) {}
        
        public void mouseClicked(MouseEvent event) {}
        
        public void mouseEntered(MouseEvent event) {}
        
        public void mouseExited(MouseEvent event) {}
        
        
        
        
    }
>>>>>>> 208e5d7fcd2508c437082b078a6d254fd15e47a7

}




