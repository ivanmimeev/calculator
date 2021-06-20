import java.util.Scanner;

public class Initiate {
    public static void InitInput(Scanner in){

        String operation = in.nextLine();
        String[] symbol = operation.split(" ");

        if(symbol.length == 3){
            input.oper = symbol[1].charAt(0);

            if(Validator.ifIntVal(symbol[0], symbol[2])){
                input.firstNumber = Integer.parseInt(symbol[0]);
                input.secondNumber = Integer.parseInt(symbol[2]);
                input.type = "Int";
            } else if(Validator.ifRomanVal(symbol[0], symbol[2])){
                input.firstNumber = Converter.romanToArabic(symbol[0]);
                input.secondNumber = Converter.romanToArabic(symbol[2]);
                input.type = "Roman";
            } else {
                input.state = false;
            }
        } else {
            input.state = false;
        }
    }
}
