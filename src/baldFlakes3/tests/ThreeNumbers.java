package src.baldFlakes3.tests;

import java.util.Scanner;

public class ThreeNumbers {

    public static void main (String[] args) {

        Scanner scInit = new Scanner (System.in);

        double a, b, c;

        System.out.println("Insert three values below: ");

        a = scInit.nextDouble();

        b = scInit.nextDouble();

        c = scInit.nextDouble();

        double maxValue = totalValues(a, b, c);

        double showTotal = totalResult(maxValue);

    }

    public static double totalValues (double x, double y, double z) {

        double receiveValues = 0;

        if (x > y && x > z) receiveValues = x;


        else if (y > x && y > z) receiveValues = y;


        else if (z > x && z > y) receiveValues = z;

        else System.out.println("Error");

        return receiveValues;

    }

    public static double totalResult (double maxValue) {

        System.out.println(maxValue);

        return maxValue;

    }

}
