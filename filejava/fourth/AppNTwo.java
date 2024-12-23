package filejava.fourth;

import java.io.*;

import java.util.Scanner;

public class AppNTwo {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        mainOperations ( init );

    }

    private static void mainOperations ( Scanner init ) {

        String path = "/Users/samunoinv/Documents/GitHub/javaStudies/filejava/fourth/noradiotoomuchhead";

        try ( BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter( path ) ) ){

            System.out.println( "How many words you want to write?" );

            int numberOfWords = init.nextInt();

            for ( int index = 0; index < numberOfWords; index ++ ) {

                bufferedWriter.write( init.next() );

                bufferedWriter.newLine();

            }

        } catch ( IOException error ) {

            System.out.printf( "Error: %s", error.getMessage() );

        }

    }

}
