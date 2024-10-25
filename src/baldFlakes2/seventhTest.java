package src.baldFlakes2;

import java.util.Scanner;

public class seventhTest {

    public static void main (String[] args) {

        sTest(args);

    }

    public static void sTest (String[] args) {

        Scanner init = new Scanner(System.in);

        double initialHour, finalHour, receiveData;

        System.out.println("Type the hours: (initialHour, finalHour)\n");

        initialHour = init.nextDouble();

        finalHour = init.nextDouble();

        if (finalHour > initialHour) {

            receiveData = finalHour - initialHour;

            System.out.println(receiveData);

        }

        else System.out.println("Insert a valid data");

    }

}
