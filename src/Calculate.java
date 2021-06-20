public class Calculate {
    public static int getResult (int symbol0, int symbol2, char oper) {
        int result = 0;

        switch (oper){
            case '+':
                result = symbol0+symbol2;
                break;
            case '-':
                result = symbol0-symbol2;
                break;
            case '*':
                result = symbol0*symbol2;
                break;
            case '/':
                result = symbol0/symbol2;
                break;
        }

        return result;
    }

}
