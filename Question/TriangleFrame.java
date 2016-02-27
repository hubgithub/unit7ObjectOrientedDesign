import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class TriangleFrame extends JFrame
{
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    
    private JFrame frame;
    private JPanel panel;
    private TriangleComponent tri;
    public TriangleFrame()
    {

        

        //Add triangle component
        tri = new TriangleComponent();
        this.add(tri);
        

    }

    public static void main(String []args)
    {
        TriangleFrame triFrame = new TriangleFrame();
        triFrame.setSize(WIDTH,HEIGHT);
        triFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        triFrame.setVisible(true);
        
    }
    
    class Triangle_Listener implements MouseListener
    {
        
        public void mousePressed(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            
            tri.addPoint(x,y);
            
        }
        
        public void mouseReleased(MouseEvent event) {}
        
        public void mouseClicked(MouseEvent event) {}
        
        public void mouseEntered(MouseEvent event) {}
        
        public void mouseExited(MouseEvent event) {}
        
        
        
        
    }
    
    
    

}
