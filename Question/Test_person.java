import java.util.Scanner;


public class Test_person
{

    public static void main(String []args)
    {
        String[] names = new String[10]; 
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Type in the name: ");
            String nam = scan.next();
            
            names[i] = nam;
        }
        
        Person per1 = new Person(names[0]);
        Person per2 = new Person(names[1]);
        Person per3 = new Person(names[2]);
        Person per4 = new Person(names[3]);
        Person per5 = new Person(names[4]);
        Person per6 = new Person(names[5]);
        Person per7 = new Person(names[6]);
        Person per8 = new Person(names[7]);
        Person per9 = new Person(names[8]);
        Person per10 = new Person(names[9]);
        
    }



}
