package tp1;

public class RomanToArabic {
    public int romanToArabic(String roman) {
        int counter = 0;
        for(int i = 0; i < roman.length(); i++) {
            String current = roman.substring(i, i+1);
            if(current.equals("I")) {
                counter += 1;
            } else if(current.equals("V")) {
                counter += 5;
            }
        }
        return counter;
    }
}
