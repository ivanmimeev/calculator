import java.util.Scanner;

public class input {

    public static int firstNumber;
    public static int secondNumber;
    public static boolean state = true;
    public static String type;
    public static char oper;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Initiate.InitInput(in);

        if (state && Validator.ifOperValid(oper) && Validator.inRange(firstNumber, secondNumber)){
            int result = Calculate.getResult(firstNumber, secondNumber, oper);
            if(type.equals("Roman")){
                System.out.println(Converter.arabicToRoman(result));
            } else if(type.equals("Int")){
                System.out.println(result);
            }
        } else {
            System.out.println("Ошибка ввода");
        }
        System.out.println("Программа завершена");
    }
}


