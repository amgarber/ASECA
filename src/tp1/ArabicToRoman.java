package tp1;

public class ArabicToRoman {
    public String arabicToRoman(int arabic){
        if (arabic == 1 ){
            return "I";
        }
        return "";
    }


    private String arabicValueOf(char arabicChar){
        if (arabicChar == 1) return "I";
        if (arabicChar == 5) return "V";
        if (arabicChar == 10) return "X";
        if (arabicChar == 50) return "L";
        if (arabicChar == 100) return "C";
        if (arabicChar == 500) return "D";
        if (arabicChar == 1000) return "M";

        return "";
    }
}
