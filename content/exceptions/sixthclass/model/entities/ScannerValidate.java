package content.exceptions.sixthclass.model.entities;

import java.util.Scanner;

public class ScannerValidate {

    private static boolean hasNextInt ( Scanner init ) {

        return init.hasNextInt();

    }

    public static int validateInt ( Scanner init ) {

        while ( !hasNextInt( init )) {

            System.out.println( "Enter a valid number!" );

            init.next();

        }

        return init.nextInt();

    }

}
