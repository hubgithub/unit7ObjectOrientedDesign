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
        
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String []args)
    {
        TriangleFrame triFrame = new TriangleFrame();
        
    }
    
    
    

}
