
/**
 * Just a copy-paste of the assignment so I can work on it without Canvas
 * access during a planned internet outage.
 *
 * @author Catherine Oldfield
 * @version 11/22/2020
 */
public class Week12Lab
{
    /**
     * Tasks for this assignment:
     * 1. Change the file read method so that a blank line marks the end of 
     * the entry and lines of text get appended if they appear next to one 
     * another. ie. 
     *      This would be an entry
     *      
     *      This would become a
     *      multiline entry
     *      because it hasn't reached an empty
     *      line yet
     *      
     *      and this would be a new entry
     * 
     * Be sure to test what happens if you have three blank lines in a row.
     * 
     * 2. Change the method that populates the response hash map to read 
     * from a file. The file format should be first line, comma separated 
     * list of values (or single value) for key for the responses, any number
     * of lines that are non blank constitute the response. A blank line
     * indicates the end of a key, value pair.  Write your file reading code 
     * to your specifications and test. ie
     * 
     *      crash, crashes
     *      Well, it never crashes on our system. It must have something
     *      to do with your system. Tell me more about your configuration.
     * 
     * Submitting your project -
     *      Commit to your github repository
     *      post URL to your completed repository to this assignment
     */
    
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Week12Lab
     */
    public Week12Lab()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
