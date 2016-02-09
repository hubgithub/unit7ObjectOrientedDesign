
public class Person implements Comparable
{
    private String name;
    
    public Person(String in_name)
    {
        name = in_name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int compareTo(Object obj)
    {
        Person com_person = (Person)obj;
        
        return this.name.compareTo(com_person.getName());
    }

}
