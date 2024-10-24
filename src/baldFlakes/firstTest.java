package src.baldFlakes;

import java.util.Scanner;

public class firstTest {

    public static void main (String[] args) {

        fTest(args);

        fTest2(args);

    }

    public static void fTest (String[] args) {

        int x, y, addition;

        x = 30;

        y = 10;

        addition = x + y;

        System.out.printf("The addition between %s and %s is: %s\n", x, y, addition);

    }

    public static void fTest2 (String[] args) {

        Scanner startScanner = new Scanner (System.in);

        int firstData = startScanner.nextInt();

        int secondData = startScanner.nextInt();

        int receiveValues = firstData + secondData;

        System.out.printf("The result between %s and %s is: %s", firstData, secondData, receiveValues);

        startScanner.close();

    }

}
