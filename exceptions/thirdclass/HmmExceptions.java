package exceptions.thirdclass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HmmExceptions {

    // In this file, we're going to create some Exceptions using Scanner
    // In order to simulate what a stupid user could do while using our application

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        mainOperation ( init );

    }

    private static void mainOperation ( Scanner init ) {

        // Ok, let's see...

        int randomNumber;

        while ( true ) {

            try {

                randomNumber = init.nextInt();

                System.out.println( randomNumber );

                break;

            } catch ( InputMismatchException error ) {

                System.out.print( "Enter a valid number!\n" );

                init.next();

            }

        }

    }

}
