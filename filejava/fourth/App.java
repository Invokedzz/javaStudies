package filejava.fourth;

import java.io.FileReader;

import java.io.BufferedReader;
import java.io.IOException;

public class App {

    public static void main ( String[] args ) {

        randomAssFunction ();

    }

    private static void randomAssFunction () {

        String path = "/Users/samunoinv/Documents/GitHub/javaStudies/filejava/first/app/firstfile";

        try (BufferedReader bufferedReader = new BufferedReader( new FileReader ( path ) ) ) {

            String line = bufferedReader.readLine();

            while ( line != null ) {

                System.out.println( line );

                line = bufferedReader.readLine();

            }

        } catch ( IOException error ) {

            System.out.printf( "Error: %s", error.getMessage() );

        }

    }

}
