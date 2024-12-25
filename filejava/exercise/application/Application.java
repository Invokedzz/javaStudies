package filejava.exercise.application;

import filejava.exercise.model.entities.Product;

import filejava.exercise.model.exceptions.InvalidValueException;

import java.io.*;

import java.util.Scanner;

public class Application {

    public static void main ( String[] args ) {

        Scanner init = new Scanner( System.in );

        runProgram ( init );

    }

    private static void runProgram ( Scanner init ) {

        int numberOfProducts = returnValidatedInt( init );

        int getValidatedValue = aboveZeroYouIdiot( numberOfProducts );

        System.out.println( getValidatedValue );

    }

    private static boolean hasNextInt ( Scanner init ) {

        return init.hasNextInt();

    }

    private static int returnValidatedInt ( Scanner init ) {

        while ( !hasNextInt( init ) ) {

            System.out.println( "Enter a valid number!" );

            init.next();

        }

        return init.nextInt();

    }

    private static int aboveZeroYouIdiot ( int intValue ) {

        try {

            if ( intValue <= 0 ) throw new InvalidValueException( "Enter a value above zero!" );

            return intValue;

        } catch ( InvalidValueException error ) {

            System.out.printf( "Error: %s", error.getMessage() );

        }

        return 1;

    }

}
