import org.junit.Before;
import org.junit.Test;

import java.util.StringTokenizer;
import static org.junit.Assert.*;
public class CoordinateTest {
    StringTokenizer st;
    @Before
    public void setUp() {
        String str = "(8,10)";
        str = str.substring(1);
        str = str.substring(0,str.length()-1);
        st = new StringTokenizer(str,",");
    }

    @Test
    public void oneInput() {
        assertEquals(1,st.countTokens());
        System.out.println("입력이 하나만 들어온 경우");
    }

    @Test
    public void overInput() {
        assertNotEquals(2,st.countTokens());
        System.out.println("입력이 두개이상 입력한 경우");
    }

    @Test
    public void isNotRightNumber() {
        assertTrue(isRight(st));
    }

    private boolean isRight(StringTokenizer st) {
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        if(y < 0 || y > 25 || x < 0 || x > 25) return false;
        return true;
    }
}
