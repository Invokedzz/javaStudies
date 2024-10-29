package src.baldFlakes2.tests;

import java.util.Scanner;

public class forLoop {

    public static void main (String[] args) {

        Scanner initSc = new Scanner (System.in);

        System.out.println("Insert an initial value/number");

        int receiveValue = initSc.nextInt();

        int receivedValue;

        int i;

        for (i = 0; i <= 5; i++) {

            receivedValue = receiveValue += i;
            System.out.println(receivedValue);

        }

        System.out.println("Done!");

    }

}
