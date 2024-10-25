package src.baldFlakes;

import java.util.Scanner;

public class sixthTest {

    public static void main (String[] args) {

        sTest(args);

    }

    public static void sTest (String[] args) {

        Scanner sc = new Scanner (System.in);

        double A, B, C;

        double areaSquare, areaTriangle, areaCircle, areaRectangle, areaTrap;

        System.out.println("Insert the values for: A, B, C\n");

        A = sc.nextDouble();

        B = sc.nextDouble();

        C = sc.nextDouble();

        areaTriangle = (A * C) / 2;

        areaSquare = Math.pow(B, 2);

        areaRectangle = A * B;

        areaCircle = C * Math.PI;

        areaTrap = ((A + B) * C) / 2;

        System.out.printf("We received the following values: %s, %s, %s, %s, %s",
                areaTriangle, areaCircle, areaSquare, areaRectangle, areaTrap);

    }

}
