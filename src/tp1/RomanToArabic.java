package tp1;

public class RomanToArabic {
    public int romanToArabic(String roman) {
        int counter = 0;

        for (int i = 0; i < roman.length(); i++) {
            int currentValue = valueOf(roman.charAt(i));

            if (isSubstraction(roman, i)) {
                counter -= currentValue;
            } else {
                counter += currentValue;
            }
        }

        return counter;
    }

    public boolean isSubstraction(String roman, int i) {
        if (i + 1 >= roman.length()) {
            return false;
        }

        return valueOf(roman.charAt(i)) < valueOf(roman.charAt(i + 1));
    }

    private int valueOf(char romanChar) {
        if (romanChar == 'I') return 1;
        if (romanChar == 'V') return 5;
        if (romanChar == 'X') return 10;
        if (romanChar == 'L') return 50;
        if (romanChar == 'C') return 100;
        if (romanChar == 'D') return 500;
        if (romanChar == 'M') return 1000;

        throw new IllegalArgumentException("El numero romano no es valido: " + romanChar);
    }


}
