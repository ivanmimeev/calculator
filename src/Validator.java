public class Validator {
    public static boolean ifIntVal(String s1, String s2){
        try{
            Integer.parseInt(s2);
            Integer.parseInt(s1);
            return true;
        } catch (NumberFormatException ignored) {
        }
        return false;
    }

    public static boolean ifRomanVal(String s1, String s2){
        return Converter.romanToArabic(s1) > 0 && Converter.romanToArabic(s2) > 0;
    }

    public static boolean ifOperValid(char oper){
        return oper == '+' || oper == '-' || oper == '*' || oper == '/';
    }

    public static boolean inRange(Integer firstNumber, Integer secondNumber){
        return (firstNumber >= 1 && firstNumber <= 10) && (secondNumber >= 1 && secondNumber <= 10);
    }
}
