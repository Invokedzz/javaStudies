package src.baldFlakes3.tests;

import java.util.Scanner;

public class fourthTest {

    public static void main (String[] args) {

        Scanner initSc = new Scanner(System.in);

        System.out.println("Insert the sequence");

        int receiveValue = initSc.nextInt();

        for (int q = 0; q < receiveValue; q++) {

            System.out.println("Insert (1), (2), (3)");

            double firstValue = initSc.nextDouble();

            double secondValue = initSc.nextDouble();

            double thirdValue = initSc.nextDouble();

            double addReceivedValues = (firstValue * 2.0 + secondValue * 3.0 + thirdValue * 5.0);

            double resultTotal = addReceivedValues / 10.0;

            System.out.println(resultTotal);

        }

        System.out.println("Done!");

    }

}
