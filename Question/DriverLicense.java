
public class DriverLicense extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private int ex_year;

    public DriverLicense(String n, int year)
    {
        super(n);
        ex_year = year;
    }
    
    public boolean isExpired()
    {
        if(ex_year < 2016)
        {
            return false;
        }
        return true;
    }
    
    public String format()
    {
        String str = "";
        str += n + " " + year;
        
        return str;
    }

}
