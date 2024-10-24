package src.baldFlakes;

import java.util.Scanner;

public class thirdTest {

    public static void main (String[] args) {

        tTest(args);

    }

    public static void tTest (String[] args) {

        Scanner dropIt = new Scanner (System.in);

        double A, B, C, D, receiveAB, receiveCD, finalResult;

        System.out.println("Insert the values for A, B, C, D");

        A = dropIt.nextDouble();

        B = dropIt.nextDouble();

        C = dropIt.nextDouble();

        D = dropIt.nextDouble();

        receiveAB = A * B;

        receiveCD = C * D;

        finalResult = receiveAB - receiveCD;

        System.out.printf("The result for %s - %s is: %s", receiveAB, receiveCD, finalResult);

    }

}
