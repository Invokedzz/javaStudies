package exceptions.firstclass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IDontKnow {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        mainOperation ( init );

    }

    private static void mainOperation ( Scanner init ) {

        // we need to use "nextLine()" in order to insert a bunch of names
        // ArrayIndexOutOfBoundsException
        // InputMismatchException

        try {

            String [] vector = init.nextLine().split(" ");

            int certainElement = init.nextInt();

            System.out.println(vector[certainElement]);

        } catch ( InputMismatchException e ) {

            String [] handleError = new String[] { "James", "Paul", "Peter" };

            System.out.println( handleError [ 1 ] );

        //    e.printStackTrace(); // displays the exception

            return;

        } catch ( ArrayIndexOutOfBoundsException e ) {

            System.out.println( "Enter a valid number in order to access the index correctly!" );

            return;

        }

        System.out.println( "End of program!" );

    }

}
