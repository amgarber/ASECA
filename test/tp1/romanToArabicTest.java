import org.junit.Test;
import tp1.RomanToArabic;

import static org.junit.Assert.assertEquals;


public class romanToArabicTest {
    //test mas basico: si le paso I me devuelve 1
    @Test
    public void testRomanIToArabic1() {
        RomanToArabic rta = new RomanToArabic();
        int result = rta.romanToArabic("I");
        assertEquals(1, result);
    }

    //test 2: si le paso V me devuelve 5
    @Test
    public void testRomanVToArabic5() {
        RomanToArabic rta = new RomanToArabic();
        int result = rta.romanToArabic("V");
        assertEquals(5, result);
    }
}



