package lab14.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator c = new Calculator();
        assertEquals(9.0, c.add(4.0, 5.0));
    }

    @Test
    void testMultiply() {
        Calculator c = new Calculator();
        assertEquals(20.0, c.multiply(4.0, 5.0));
    }

    @Test
    void testDivideNormal() {
        Calculator c = new Calculator();
        assertEquals(2.0, c.divide(10.0, 5.0));
    }

    @Test
    void testDivideByZero() {
        Calculator c = new Calculator();
        assertThrows(IllegalArgumentException.class,
                () -> c.divide(1.0, 0.0));
    }
}
