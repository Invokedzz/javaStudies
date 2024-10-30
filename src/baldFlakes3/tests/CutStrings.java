package src.baldFlakes3.tests;

import java.util.Scanner;

public class CutStrings {

    public static void main (String[] args) {

        Scanner initSc = new Scanner (System.in);

        System.out.println("Insert a value");

        String randomString = initSc.next();

        String randomStringTwo = initSc.next();

        String sliceString = randomString.substring(2);

        String sliceStringTwo = randomStringTwo.substring(2, 5);

        System.out.println(sliceString + " " + sliceStringTwo);

    }

}
