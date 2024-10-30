package src.baldFlakes3.tests;

import java.util.Scanner;

public class HappyBits {

    public static void main (String[] args) {

        Scanner initSc = new Scanner (System.in);

        System.out.println("Insert a value");

        int gettingStarted = initSc.nextInt();

        int masquerade = 0b000100; // Bits position

        if ((gettingStarted & masquerade) != 0) System.out.println("6th bit is true");

        else System.out.println("6th bit is false");

    }

}
