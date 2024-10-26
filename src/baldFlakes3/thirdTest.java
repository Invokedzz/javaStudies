package src.baldFlakes3;

import java.util.Scanner;

import java.util.Locale;

public class thirdTest {

    public static void main (String[] args) {

        tTest(args);

    }

    public static void tTest (String[] args) {

        Locale.setDefault(Locale.CHINESE);

        Scanner playerBase = new Scanner(System.in);

        int codeValue;

        System.out.println("Select your character: Mario (1), Sonic (2), Link (3)");

        codeValue = playerBase.nextInt();

        if (codeValue == 1) System.out.println("Mario selected");

        else if (codeValue == 2) System.out.println("Sonic selected");

        else if (codeValue == 3) System.out.println("Link selected");

        else System.out.println("Select a valid option");

    }

}
