
/**
 * Write a description of class hi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;

public class hi
{
    // instance variables - replace the example below with your own
    private int x;
    private String hello_world;

    /**
     * Constructor for objects of class hi
     */
    public hi()
    {
        // initialise instance variables
        x = 0;
        hello_world = "hello, Shauryas";
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
    
    public void helloworldMethod()
    {
        // put your code here
        System.out.println(hello_world);
    }
    
    public static void main(String[] args) {
        // Your code goes here
        System.out.println("Hello, World!");
    }
}
