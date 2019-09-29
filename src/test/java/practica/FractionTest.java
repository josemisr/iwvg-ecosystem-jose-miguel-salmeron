package practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(5, 2);
    }

    @Test
    void testGetNumerator() {
        assertEquals(5, fraction.getNumerator());
    }
    @Test
    void testGetDenominator() {
        assertEquals(2, fraction.getDenominator());
    }

}