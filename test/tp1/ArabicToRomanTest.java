package tp1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArabicToRomanTest {

    @Test
    public void testArabicToRoman(){
        ArabicToRoman rta = new ArabicToRoman();
        String result = rta.arabicToRoman(1);
        assertEquals("I", result);
    }

    @Test
    public void testArabicToRoman2(){
        ArabicToRoman rta = new ArabicToRoman();
        String result = rta.arabicToRoman(2);
        assertEquals("II", result);
    }
    @Test
    public void testArabicToRoman4(){
        ArabicToRoman rta = new ArabicToRoman();
        String result = rta.arabicToRoman(4);
        assertEquals("IV", result);
    }
}
