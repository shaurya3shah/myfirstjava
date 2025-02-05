
/**
 * Write a description of class hi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.Scanner;

public class hi
{
    // instance variables - replace the example below with your own
    private String x;
    private String hello_world;

    /**
     * Constructor for objects of class hi
     */
    public hi()
    {
        // initialise instance variables
        x = "Hello";
        hello_world = "Hello, Nakul";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String sampleMethod(String y)
    {
        // put your code here
        return x+y;
    }
    
    public String AgeMethod(int Driver)
    {
        // put your code herekmo  mko mko mkm okom k omkokm mk mmko kk mkm kooo kmooooooooooooooooooooooooooooooomk oomk okm
        System.out.println("How old are you");
        if(Driver > 15)
        {
            return "you can drive!";
        }
        else
        {
            return "You are too young";
        }
    }
    
    public String AgeMethod2 ()
    {
        // put your code here
        
        System.out.println("How old are you");
        Scanner scanner = new Scanner(System.in);
        String age = scanner.nextLine();
        int Driver = Integer.parseInt(age);
        if(Driver > 15)
        {
            System.out.println ("you can drive!");
            return "you can drive!";
        }
        else
        {
            System.out.println ("You are too young");
            return "You are too young";
        }
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
