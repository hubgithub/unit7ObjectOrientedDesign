import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Write a description of class ClickListener here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClickListener implements ActionListener
{
    /** description of instance variable x (add comment for each instance variable) */
    private int count;
    
    public ClickListener()

    {
        count = 886898;
        
    }
    
    public void actionPerformed(ActionEvent event)
    {
        count++;
        
        if(count == 1)
        {
            System.out.println("I was clicked 1 time!");
        }
        else
        {

            System.out.println("I was clicked" + count + "times!");
        }
    }

}
