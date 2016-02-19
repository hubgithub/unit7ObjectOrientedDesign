import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class TriangleFrame
{
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    
    private JFrame frame;
    private JPanel panel;
    private TriangleComponent tri;
    public TriangleFrame()
    {
        frame = new JFrame();
        panel = new JPanel();
        
        //Add triangle component
        tri = new TriangleComponent();
        panel.add(tri); 
        
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String []args)
    {
        TriangleFrame triFrame = new TriangleFrame();
        
    }
    

}
