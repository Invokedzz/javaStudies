package src.trainingFunctions.List.TrianglesTest.application;

import src.trainingFunctions.List.TrianglesTest.entities.TriangleEntity;

import java.util.Scanner;

import java.util.Locale;

public class TriangleApp {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        Scanner initSc = new Scanner (System.in);

        TriangleEntity value1, value2;

        value1 = new TriangleEntity();

        value2 = new TriangleEntity();

        value1.a = initSc.nextDouble();

        value1.b = initSc.nextDouble();

        value1.c = initSc.nextDouble();

        value2.a = initSc.nextDouble();

        value2.b = initSc.nextDouble();

        value2.c = initSc.nextDouble();

        double area1 = firstCalc(value1.a, value1.b, value1.c);

        double area2 = secondCalc(value2.a, value2.b, value2.c);

        if (area1 > area2) System.out.println("area1 > area2");

        else System.out.println("area2 > area1");

    }

    public static double firstCalc (double a, double b, double c) {

        if (a + b > c && a + c > b && b + c > a) {

            double p = (a + b + c) / 2;

            double area = (p * (p - a) * (p - b) * (p - c));

            return Math.sqrt(area);

        }

        else return 0.0;

    }

    public static double secondCalc (double a, double b, double c) {

        if (a + b > c && a + c > b && b + c > a) {

            double p = (a + b + c) / 2;

            double area = (p * (p - a) * (p - b) * (p - c));

            return Math.sqrt(area);

        }

        else return 0.0;

    }

}
