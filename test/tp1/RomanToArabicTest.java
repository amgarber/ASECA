package tp1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RomanToArabicTest {
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

    //test 3: si le paso II devuelve 2
    @Test
    public void testRomanIIToArabic2() {
        RomanToArabic rta = new RomanToArabic();
        int result = rta.romanToArabic("II");
        assertEquals(2, result);
    }

    //test 4: si le paso IV devuelve 4
    @Test
    public void testRomanIVToArabic4() {
        RomanToArabic rta = new RomanToArabic();
        int result = rta.romanToArabic("IV");
        assertEquals(4, result);
    }
}



