import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MathTest {

    @Test
    public void is_two_plus_two_four() {
        int result = 2 + 2;
        assertEquals(4, result);
        assertNotEquals(5, result);
    }

    @Test
    public void is_two_plus_two_not_five() {
        int result = 2 + 2;
        assertNotEquals(5, result);
    }
}
