package POO.crypto.app;

import java.util.Scanner;

public class CryptoApp {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        mainApplication (init);

    }

    private static void mainApplication ( Scanner init ) {

        System.out.println( "Enter the first digit: " );

        int firstDigit = init.nextInt() + 7;

        System.out.println( "Enter the second digit: " );

        int secondDigit = init.nextInt() + 7;

        System.out.println( "Enter the third digit: " );

        int thirdDigit = init.nextInt() + 7;

        System.out.println( "Enter the fourth digit: " );

        int fourthDigit = init.nextInt() + 7;

    }

}
