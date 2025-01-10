package Challenge.Challenge10th.model.validations;

import java.util.Scanner;

public class ValidationsForScanner {

    private static boolean hasInt ( Scanner sc ) {

        return sc.hasNextInt();

    }

    public static int validateIntInput ( Scanner sc ) {

        while ( !hasInt( sc ) ) {

            System.out.println( "Enter a valid number!" );

            sc.next();

        }

        return sc.nextInt();

    }

}
