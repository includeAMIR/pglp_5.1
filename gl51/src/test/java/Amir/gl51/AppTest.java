package Amir.gl51;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }    
}
