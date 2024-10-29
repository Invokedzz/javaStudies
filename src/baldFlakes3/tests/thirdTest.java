package src.baldFlakes3.tests;

import java.util.Scanner;

public class thirdTest {

    public static void main (String[] args) {

        Scanner nw = new Scanner (System.in);

        System.out.println("Insert the sequence");

        int sequence = nw.nextInt();

        int fat = 1;

        for (int y = 1; y <= sequence; y++) {

            fat *= y;

        }

        System.out.println(fat);

    }

}
