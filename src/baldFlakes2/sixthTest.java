package src.baldFlakes2;

import java.util.Scanner;

public class sixthTest {

    public static void main (String[] args) {

        sTest(args);

    }

    public static void sTest (String[] args) {

        Scanner init = new Scanner(System.in);

        int A, B;

        A = init.nextInt();

        B = init.nextInt();

        if (A % B == 0 || B % A == 0) System.out.println("Mul");

        else System.out.println("No mul");

        init.close();

    }

}
