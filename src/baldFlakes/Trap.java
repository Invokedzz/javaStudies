package src.baldFlakes;

public class Trap {

    public static void main (String[] args) {

       float smallBase, biggerBase, area, h;

       smallBase = 10.0f;

       biggerBase = 30.0f;

       h = 4.0f;

       area = ((smallBase + biggerBase) * h) / 2;

       System.out.println("The result is: " + area);

       receiveValuesAgain(args);

    }

    public static void receiveValuesAgain (String[] args) {

        int valueA, valueB;

        double result;

        valueA = 7;

        valueB = 2;

        result = (double) valueA / valueB;

        System.out.println(result);

    }

}
