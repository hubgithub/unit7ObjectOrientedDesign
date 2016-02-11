import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;

/**
 * Write a description of class Triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangle
{
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    
    private JFrame frame;
    private JPanel panel;
    private MouseEvent mouse;
    private Graphics2D draw;
    
    public Triangle()
    {
        frame = new JFrame();
        panel = new JPanel();
        mouse = new MouseEvent();
        draw = new Graphics2D();
        
        frame.setSize(WIDTH,HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


    public static void main(String []args)
    {
        
        
        
        if(mouse.getClickCout()%3 !=0)
        {
            frame = new JFrame(WIDTH,HEIGHT);
        }
        
    }

}
