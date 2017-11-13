import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class KeypadNumberCounterTest {

    private KeypadNumberCounter knc;
    private Point startingPoint;

    @Before
    public void setUp() throws Exception {
        startingPoint = new Point(0,0);
        knc = new KeypadNumberCounter(startingPoint, new Keypad(KeyPadTypes.NUMERIC_KEY_PAD), new Diagonal());
    }

    @Test
    public void getCountForOneDigit() throws Exception {
        assertEquals(1, knc.getCount(1));
    }

    @Test
    public void getCountForTenDigits() throws Exception {
        assertEquals(27770, knc.getCount(10));
    }

    @Test
    public void getCountForZeroDigits() throws Exception {
        assertEquals(0, knc.getCount(0));
    }

    @Test
    public void getCountForTwoDigitsWithACenterStartingPoint() throws Exception {
        startingPoint = new Point(1,1);
        knc.setStartingPoint(startingPoint);
        assertEquals(5, knc.getCount(2));
    }
}