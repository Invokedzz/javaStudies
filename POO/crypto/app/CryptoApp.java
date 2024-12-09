package POO.crypto.app;

import java.util.Scanner;

public class CryptoApp {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        mainApplication (init);

    }

    private static void mainApplication ( Scanner init ) {

        String input = init.next();

        StringBuilder sb;

        sb = new StringBuilder();

        for ( char someDigit : input.toCharArray() ) {

            int newValue = Character.getNumericValue( someDigit );

            int newDigit = ( newValue + 7 ) % 10;

            sb.append( newDigit );

        }

        char firstDigit = sb.charAt( 0 );

        char secondDigit = sb.charAt( 1 );

        char thirdDigit = sb.charAt( 2 );

        char fourthDigit = sb.charAt( 3 );

        sb.setCharAt( 0, thirdDigit );

        sb.setCharAt( 1, fourthDigit );

        sb.setCharAt( 2, firstDigit );

        sb.setCharAt( 3, secondDigit );

        System.out.println( sb );

    }

}
