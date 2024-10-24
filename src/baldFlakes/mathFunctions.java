package src.baldFlakes;

public class mathFunctions {

    public static void main (String[] args) {

        sMath(args);

        pMath(args);

    }

    public static void sMath (String[] args) {

        double A = 30.0;

        double B = 45.0;

        double receivedFirstValue, receivedSecondValue;

        receivedFirstValue = Math.sqrt(A);

        receivedSecondValue = Math.sqrt(B);

        System.out.println("We received the following values: ");

        System.out.println(receivedFirstValue + " " + receivedSecondValue);

    }

    public static void pMath (String[] args) {

        double first = 10.0;

        double second = 34.0;

        double firstValue, secondValue;

        firstValue = Math.pow(first, second);

        secondValue = Math.pow(second, first);

        System.out.println("We received the following values: ");

        System.out.println(firstValue + " " + secondValue);

    }

}
