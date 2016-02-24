import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Write a description of class ButtonViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonViewer
{
    /** description of instance variable x (add comment for each instance variable) */
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    
    private JFrame frame;
    private JButton button;
    private JButton button2;
    private JPanel panel;
    private JLabel label;
    
    public ButtonViewer()
    {
        frame = new JFrame();
        panel = new JPanel();
        
        
        
        button = new JButton("A");
        panel.add(button);
        
        button2 = new JButton("B");

        panel.add(button2);
        
        label = new JLabel("Hello");
        panel.add(label);
        
        frame.add(panel);
        ClickListener listener = new ClickListener();
        button.addActionListener(listener);
        button2.addActionListener(listener);
        
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        ButtonViewer view = new ButtonViewer();
    }
    
    public class ClickListener implements ActionListener
    {
     /** description of instance variable x (add comment for each instance variable) */
     private int count;
     private String name;

    
     public void actionPerformed(ActionEvent event)
     {
        count++;
        
        label.setText("Button        " + event.getActionCommand() + "         was clicked!");
     }
    }
}
