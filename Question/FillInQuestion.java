import java.util.Scanner;

/**
 * this class supports a fill in the blank question where the answer is specified in the
 * question's text delimited by '_'. this class extracts the answer from the question's
 * text and store the text and answer accordingly.
 */
public class FillInQuestion extends Question
{
    /*Extract the answer from the specified question text. 
     * For example:
     * "The inventor of Java was _james Gosling_."
     * 
     * text: "The inventor fo Java was __________."
     * answer: "James Gosling"
     */
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        
        String answer = parser.next();
        
        question += "__________" + parser.next();
        
        //if want call super class's method, super();
        super.setText(question);
        setAnswer(answer);
    }

}
