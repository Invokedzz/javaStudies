package generics.HashCode.equalsspeed.src;

import java.io.*;

import java.util.ArrayList;

import java.util.List;

public class Program {

    public static void main ( String[] args ) {

        runThisShitPlease ();

    }

    private static void runThisShitPlease () {

        File file = new File( "/Users/samunoinv/Documents/GitHub/javaStudies/generics/HashCode/hashcodespeed/files/filewithsomenames" );

        List < String > list = new ArrayList<>();

        try ( BufferedReader bufferedReader = new BufferedReader( new FileReader( file ))) {

            String line = bufferedReader.readLine();

            while ( line != null ) {

                line = bufferedReader.readLine();

                list.add( line );

            }

            for ( int index = 0; index < list.size(); index ++ ) {

                boolean areTheValuesEqualToEachOther = list.get( index ).equals( list.get( index + 1 ));

                System.out.println( areTheValuesEqualToEachOther );

            }

        } catch ( IOException | IndexOutOfBoundsException error ) {

            System.out.printf( "%s", error.getMessage() );

        }

    }

}
