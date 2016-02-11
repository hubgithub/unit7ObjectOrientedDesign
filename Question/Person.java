
public class Person implements Comparable<Person>
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
    
    public int compareTo(Person other)
    {
        Person com_person = other;
        
        return this.name.compareTo(com_person.getName());
    }
    
    }
