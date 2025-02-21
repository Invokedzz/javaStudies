package content.logicExercises.exercises;

import java.util.Scanner;

public class TestNumberSeven {

    public static void main (String[] args) {

        Scanner scInit = new Scanner (System.in);

        double x, y;

        char chooseOption = scInit.next().charAt(0);

        if (chooseOption == '+') {

            System.out.println("Select the measures (x, y)");

            x = scInit.nextDouble();

            y = scInit.nextDouble();

            addition(x, y);

        }

        else if (chooseOption == '-') {

            System.out.println("Select the measures (x, y)");

            x = scInit.nextDouble();

            y = scInit.nextDouble();

            subtraction(x, y);

        }

        else if (chooseOption == '*') {

            System.out.println("Select the measures (x, y)");

            x = scInit.nextDouble();

            y = scInit.nextDouble();

            multiplication(x, y);

        }

        else if (chooseOption == '/') {

            System.out.println("Select the measures (x, y)");

            x = scInit.nextDouble();

            y = scInit.nextDouble();

            division(x, y);

        }

        else System.out.println("Invalid.");

    }

    public static void addition (double x, double y) {

        double resultAddition = x + y;

        System.out.println(resultAddition);

    }

    public static void subtraction (double x, double y) {

        double resultSubtraction = x - y;

        System.out.println(resultSubtraction);

    }

    public static void multiplication (double x, double y) {

        double resultMultiplication = x * y;

        System.out.println(resultMultiplication);

    }

    public static void division (double x, double y) {

        double resultDivision = x / y;

        System.out.println(resultDivision);

    }

}
