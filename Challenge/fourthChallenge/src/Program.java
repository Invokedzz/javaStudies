package Challenge.fourthChallenge.src;

public class Program {

    public static void main ( String[] args ) {

        int result = operate( 1, 2, "+" );

        System.out.println( result );

    }

    public static int operate (int num1, int num2, String operator) {

        return switch (operator) {

            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "%" -> num1 % num2;
            default -> 0;

        };

    }

}
