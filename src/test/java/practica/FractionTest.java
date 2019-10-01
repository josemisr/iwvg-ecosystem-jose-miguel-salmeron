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

    @Test
    void testProper() {
        assertEquals(false, fraction.proper());
    }

    @Test
    void testImproper() {
        assertEquals(true, fraction.improper());
    }

    @Test
    void testEquivalent() {
        Fraction fractionToCompare = new Fraction(10, 4);
        assertEquals(true, fraction.equivalent(fractionToCompare));
    }

}