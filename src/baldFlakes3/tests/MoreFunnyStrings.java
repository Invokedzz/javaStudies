package src.baldFlakes3.tests;

import java.util.Scanner;

public class MoreFunnyStrings {

    public static void main (String[] args) {

        Scanner initSc = new Scanner (System.in);

        System.out.println("Insert your name, user!");

        String randomString = initSc.next().toUpperCase();

        if (randomString.length() <= 3) System.out.println("More than 3 characters, please");

        else System.out.printf("Hello %s!", randomString);

    }

}
