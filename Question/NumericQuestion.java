

/**
 * Write a description of class NumericQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumericQuestion extends Question
{
    private double answer;
    
    // Example of  method overloading
    //this method overloads the setAnswer method of the Question class
    public void setAnswer(double correctResponse)
    {
        answer = correctResponse;
        
    }
    
    public boolean checkAnswer(String response)
    {
        double responseAsDouble = Double.parseDouble(response);
        
        return Math.abs(responseAsDouble - answer) <= 0.01;
    }
    

}
