package tp1;

public class RomanToArabic {
    public int romanToArabic(String roman) {
        if(roman == "I"){
            return 1;
        }
        if(roman == "V"){
            return 5;
        }
        return 0;
    }
}
