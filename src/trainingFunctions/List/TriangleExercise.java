package src.trainingFunctions.List;

import java.util.Scanner;

import java.util.Locale;

public class TriangleExercise {

    public static void main (String[] args) {

        Locale.setDefault(Locale.CHINESE);

        double receivedValue = receiveCals();

        System.out.println(receivedValue);

    }

    public static double receiveCals () {

        Scanner initSc = new Scanner (System.in);

        System.out.println("Insert the values for area1\n");

        double firstValue = initSc.nextDouble();

        double secondValue = initSc.nextDouble();

        double thirdValue = initSc.nextDouble();

        System.out.println("Insert the values for area2\n");

        double fourthValue = initSc.nextDouble();

        double fifthValue = initSc.nextDouble();

        double sixthValue = initSc.nextDouble();

        double area1 = areaCalc_First(firstValue, secondValue, thirdValue);

        double area2 = areaCalc_Second(fourthValue, fifthValue, sixthValue);

        if (area1 > area2) {

            System.out.println("area1 > area2");
            return area1;

        }

        else {

            System.out.println("area2 > area1");
            return area2;

        }

    }

    public static double areaCalc_First (double a, double b, double c) {

        double p = (a + b + c) / 2;

        double area = (p * (p - a) * (p - b) * (p - c));

        return Math.sqrt(area);

    }

    public static double areaCalc_Second (double a, double b, double c) {

        double p = (a + b + c) / 2;

        double area = (p * (p - a) * (p - b) * (p - c));

        return Math.sqrt(area);

    }

}
