package lab14.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisionTest {

    @Test
    void testDivideNormal() {
        Division d = new Division();
        assertEquals(2.0, d.divide(6.0, 3.0));
    }

    @Test
    void testDivideByZero() {
        Division d = new Division();
        assertThrows(IllegalArgumentException.class,
                () -> d.divide(5.0, 0.0));
    }
}
