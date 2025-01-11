package generics.HashCode.hashcodespeed.src;

import java.io.*;

import java.util.ArrayList;

import java.util.List;


public class Program {

    public static void main ( String[] args ) {

        checkHashCode();

    }

    private static void checkHashCode () {

        List < String > names = new ArrayList<>();

        File file = new File( "/Users/samunoinv/Documents/GitHub/javaStudies/generics/HashCode/hashcodespeed/files/filewithsomenames" );

        try ( BufferedReader bufferedReader = new BufferedReader( new FileReader( file ))) {

            String line = bufferedReader.readLine();

            while ( line != null ) {

                line = bufferedReader.readLine();

                names.add( line );

            }

            for ( String item : names ) {

                System.out.println( item );

            }

        } catch ( IOException | NullPointerException error ) {

            System.out.printf( "%s", error.getMessage() );

        }

    }

}
