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

        if (a > b && a > c) System.out.println(a);

        else if (b > a && b > c) System.out.println(b);

        else if (c > a && c > b) System.out.println(c);

        else System.out.println("Error");

    }

}
