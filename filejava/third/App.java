package filejava.third;

import java.io.BufferedWriter;

import java.io.FileWriter;

import java.io.IOException;

import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.Locale;

public class App {

    public static void main ( String[] args ) {

        Locale.setDefault( Locale.GERMAN );

        mainStuff ();

    }

    private static void mainStuff () {

        Scanner init = new Scanner ( System.in );

        BufferedWriter bufferedWriter;

        FileWriter fileWriter;

        String path = "/Users/samunoinv/Documents/GitHub/javaStudies/filejava/third/randomfileagain";

        try {

            fileWriter = new FileWriter( path );

            bufferedWriter = new BufferedWriter( fileWriter );

            System.out.println( "How many words do you want to write?" );

            int numberOfWords = init.nextInt();

            for ( int index = 0; index < numberOfWords; index++ ) {

                bufferedWriter.write( init.next() );

                bufferedWriter.newLine();

            }

            bufferedWriter.close();

        } catch ( IOException | InputMismatchException error ) {

            System.out.printf( "Error: %s", error.getMessage() );

        }

    }

}
