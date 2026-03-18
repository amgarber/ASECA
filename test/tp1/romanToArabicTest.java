import org.junit.Test;
import tp1.RomanToArabic;

import static org.junit.Assert.assertEquals;

//test mas basico: si le paso I me devuelve 1
public class romanToArabicTest {
    @Test
    public void testRomanIToArabic1() {
        RomanToArabic rta = new RomanToArabic();
        int result = rta.romanToArabic("I");
        assertEquals(1, result);
    }
}



