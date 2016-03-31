package bingyue.dubbo.provider;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple TestServiceImpl.
 */
public class TestServiceImplTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestServiceImplTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestServiceImplTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testTestServiceImpl()
    {
        assertTrue( true );
    }
}
