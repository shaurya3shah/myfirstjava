

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class testHello.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testHello
{
    /**
     * Default constructor for test class testHello
     */
    public testHello()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testHello()
    {
        HelloWorld hello = new HelloWorld();
        hello.helloWorld("Chicago");
    }
}
