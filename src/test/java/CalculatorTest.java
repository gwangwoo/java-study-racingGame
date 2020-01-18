import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator cal;

    @Before
    public void setUp() {
        cal = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(9, cal.add(4, 5));
    }
    @Test
    public void sub() {
        assertEquals(1,cal.sub(5,4));
    }
    @Test
    public void mul() {
        assertEquals(10,cal.mul(2,5));
    }
    @Test
    public void div() {
        assertEquals(2,cal.div(10,5));
    }

    @After
    public void tearDown() {
        cal = null;
    }
}
