package src.baldFlakes3.tests;

import java.util.Scanner;

public class OtherStrings {

    public static void main (String[] args) {

        Scanner initSc = new Scanner (System.in);

        String anyStringValue = initSc.next();

        String receiveNewString = anyStringValue.replace('a', '@');

        if (receiveNewString.length() < 5) System.out.println("Insert more than 5 characters");

        else System.out.printf("Our System received: %s", receiveNewString);

    }

}
