import javax.swing.JFrame;
import javax.swing.JButton;

/**
 * Write a description of class ButtonViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonViewer
{
    /** description of instance variable x (add comment for each instance variable) */
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 60;
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JButton button = new JButton("Cli9ck Me!");
        frame.add(button);
        
        ClickListener listener = new ClickListener();
        button.addActionListener(listener);
        
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
