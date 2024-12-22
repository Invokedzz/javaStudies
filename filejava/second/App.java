package filejava.second;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.FileReader;

import java.util.Locale;

public class App {

    public static void main ( String[] args ) {

        Locale.setDefault( Locale.GERMAN );

        mainOperations ();

    }

    private static void mainOperations () {

        String path = "/Users/samunoinv/Documents/GitHub/javaStudies/filejava/second/happyfile";

        BufferedReader bufferedReader = null;

        FileReader fileReader;

        try {

            fileReader = new FileReader( path );

            bufferedReader = new BufferedReader( fileReader );

            String line = bufferedReader.readLine();

            while ( line != null ) {

                System.out.println( line );

                line = bufferedReader.readLine();

            }

        } catch ( IOException error ) {

            System.out.printf( "Error: %s", error.getMessage() );

        } finally {

            try {

                if ( bufferedReader != null ) bufferedReader.close();

            } catch ( IOException error ) {

                System.out.println( error.getMessage() );

            }

        }

    }

}
