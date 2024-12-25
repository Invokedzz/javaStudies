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

        File file = new File( "/Users/samunoinv/Documents/GitHub/javaStudies/filejava/exercise/model/out/productslist" );

        int numberOfProducts = returnValidatedInt( init );

        int validatedValue = aboveZeroYouIdiot( numberOfProducts );

        if ( file.isFile() || file.canRead() ) {

            try ( BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter( file, true ) ) ) {

                for ( int index = 0; index < validatedValue; index ++ ) {

                    // productName, productPrice, productQuantity;

                    String productName = init.next();

                    double productPrice = init.nextDouble();

                    int productQuantity = returnValidatedInt( init );

                    Product product = new Product( productName, productPrice, productQuantity );

                    bufferedWriter.write( product.toString() );

                }

                System.out.println( "Success! The product was sent to the system!" );

            } catch ( IOException error ) {

                System.out.printf( "Error: %s", error.getMessage() );

            }

        }

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
