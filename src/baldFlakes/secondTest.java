package src.baldFlakes;

import java.util.Scanner;

public class secondTest {

    public static void main (String[] args) {

        sTest(args);

        sTest2(args);

    }

    public static void sTest (String[] args) {

        double radius, area;

        radius = Math.pow(3.0, 2.0);

        area = radius * Math.PI;

        System.out.printf("We received the following value: %.5f\n", area);

    }

    public static void sTest2 (String[] args) {

        Scanner input = new Scanner(System.in);

        double radiusBeta, radius, area;

        System.out.println("Insert a valid number\n");

        radiusBeta = input.nextDouble();

        radius = Math.pow(radiusBeta, 2);

        area = radius * Math.PI;

        System.out.printf("We received the following value: %.5f\n", area);

    }

}
