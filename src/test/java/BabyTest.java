import baby.BabyYear4;
import baby.BabyYearTwo;
import baby.BabyYearZero;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BabyTest {

    @Test
    public void what_it_can_in_0_years() {
        BabyYearZero baby = new BabyYearZero();

        assertEquals("whaaaaaaaaa", baby.cry());
        assertEquals(0.3, baby.poo(), 0);

        assertNotEquals("Mama", baby.cry());
    }

    @Test
    public void what_it_can_in_2_years() {
        BabyYearTwo baby = new BabyYearTwo();

        assertEquals("whaaaaaaaaa", baby.cry());
        assertEquals(1, baby.poo(), 0);

        assertNotEquals("Mama", baby.cry());
        assertEquals(1, baby.walk());
    }

    @Test
    public void check_walking() {
        BabyYear4 baby = new BabyYear4();

        baby.run();
        baby.run(1);
        baby.run(1, 2);
    }
}
