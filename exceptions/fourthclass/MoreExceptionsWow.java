package exceptions.fourthclass;

import java.util.Scanner;

public class MoreExceptionsWow {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        mainOperations ( init );

    }

    private static void mainOperations ( Scanner init ) {

        // You can create some functions in order to validate the "nextInt()" method;
        // or, you can use the try/catch in order to do that

        int numberOfEmployees = init.nextInt();

        for ( int index = 0; index < numberOfEmployees; index ++ ) {

        }

    }

}
