package lab14.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {

    @Test
    void testAddPositive() {
        Addition a = new Addition();
        assertEquals(7.0, a.add(3.0, 4.0));
    }

    @Test
    void testAddNegative() {
        Addition a = new Addition();
        assertEquals(-1.0, a.add(3.0, -4.0));
    }
}
