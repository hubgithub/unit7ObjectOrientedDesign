

/**
 * Write a description of class IDCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IDCard extends Card
{
    String idNumber;
    String name;
    public IDCard(String n, String id)
    {  
        super(n);
        name = n;
        idNumber = id;
    }
    
    public String format()
    {
        String str = "";
        
        str += name + " " + idNumber;
        
        return str;
    }
    
    /**
    public boolean equals(Object other)
    {
        //first, check if this object and the other object are of the same class
        if(this.getClass() == other.getClass())
        {
            //if so, cast the other object to an IDCard
            IDCard otherIDCard = (IDCard)other;
            
            //second, check if the superclass (Card) determines that this object and
            //the other object are equal
            boolean isEqual = super.equals(other);
            
            //third, check if the instance varibles of this object and the other object are equal
            //return isEqual && this.idNumber.equals(other.idNumber);
        }
        return false;
    }
    */
}
