

public class CallingCard extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private String pin;
    String name;
    private String num;
    public CallingCard(String n, String number, String Pin)
    {
        name = super(n);
        num = number;
        pin = Pin;
    }
    
    public String format()
    {
        String str = "";
        str += name + " " + number + " " + pin;
        
        return str;
        
    }
    

}
