

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MedianTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MedianTest
{
    /**
     * Default constructor for test class MedianTest
     */
    public MedianTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }


    @Test
    public void testMedianWrong()
    {
        assertEquals(2, Median.medianWrong(2, 3, 1));
        assertEquals(2, Median.medianWrong(1, 2, 3));
        assertEquals(2, Median.medianWrong(3, 1, 2));
        assertEquals(2, Median.medianWrong(2, 1, 3));
        assertEquals(9, Median.medianWrong(4, 15, 9));
        assertEquals(8, Median.medianWrong(6, 8, 8));
        assertEquals(-1, Median.medianWrong(-2, -1, 3));
    }

    @Test
    public void testMedianCorrect()
    {
        assertEquals(2, Median.medianCorrect(1, 2, 3));
        assertEquals(2, Median.medianCorrect(3, 1, 2));
        assertEquals(2, Median.medianCorrect(2, 1, 3));
        assertEquals(2, Median.medianCorrect(2, 3, 1));
        assertEquals(9, Median.medianCorrect(4, 15, 9));
        assertEquals(8, Median.medianCorrect(6, 8, 8));
        assertEquals(-1, Median.medianWrong(-2, -1, 3));
    }
}




