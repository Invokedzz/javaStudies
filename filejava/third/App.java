package filejava.third;

import java.io.BufferedWriter;

import java.io.FileWriter;

import java.io.IOException;

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

        FileWriter fileReader;

        String path = "/Users/samunoinv/Documents/GitHub/javaStudies/filejava/third/randomfileagain";

        try {

            fileReader = new FileWriter( path );

            bufferedWriter = new BufferedWriter( fileReader );

            bufferedWriter.write( init.next() );

            bufferedWriter.close();

        } catch ( IOException error ) {

            System.out.printf( "Error: %s", error.getMessage() );

        }

    }

}
